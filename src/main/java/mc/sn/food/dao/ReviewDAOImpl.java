package mc.sn.food.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.ReviewVO;

@Repository("reviewDAO")
public class ReviewDAOImpl implements ReviewDAO {
	@Autowired
	private SqlSession sqlSession;

	// 리뷰 넘버링
	private int selectNewReviewNO() {
		return sqlSession.selectOne("mapper.review.selectNewReviewNO");
	}

	// 리뷰 등록
	@Override
	public int insertReview(ReviewVO reviewVO) {
		int reviewNO = selectNewReviewNO();
		reviewVO.setReviewNO(reviewNO);
		return sqlSession.insert("mapper.review.insertReview", reviewVO);
	}

	// 리뷰 조회
	@Override
	public List selectByTarget(Criteria cri) {
		List<ReviewVO> reviewList = null;
		reviewList = sqlSession.selectList("mapper.review.selectByTarget", cri);
		return reviewList;
	}

	// 리뷰 글 상세 정보 조회
	@Override
	public ReviewVO selectReview(int reviewNO) {
		return sqlSession.selectOne("mapper.review.selectReview", reviewNO);
	}

	// 리뷰 수정
	@Override
	public void updateReview(ReviewVO reviewVO) {
		sqlSession.update("mapper.review.updateReview", reviewVO);
	}

	// 리뷰 삭제
	@Override
	public void deleteReview(ReviewVO reviewVO) {
		sqlSession.delete("mapper.review.deleteReview", reviewVO);
	}

	// 리뷰 개수
	@Override
	public int countReview(String target) {
		return (Integer) sqlSession.selectOne("mapper.review.countReview", target);
	}

	// 타겟 id 리스트 저장
	@Override
	public List selectTargets() {
		List<String> targetList = null;
		targetList = sqlSession.selectList("mapper.review.selectTargets");
		return targetList;
	}

	// 타겟 리뷰 갯수
	@Override
	public int selectReCountByTarget(String key) {
		return sqlSession.selectOne("mapper.review.selectReCountByTarget", key);
	}

	// 타겟 리뷰 평균점수
	@Override
	public float selectReAvgByTarget(String key) {
		return sqlSession.selectOne("mapper.review.selectReAvgByTarget", key);
	}
}
