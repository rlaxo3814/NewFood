package mc.sn.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.food.dao.ReviewDAO;
import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.ReviewVO;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	public int addReview(ReviewVO reviewVO) {
		return reviewDAO.insertReview(reviewVO);
	}

	@Override
	public List searchReviewByTarget(Criteria cri) {
		return reviewDAO.selectByTarget(cri);
	}

	@Override
	public ReviewVO viewReview(int reviewNO) throws Exception {
		ReviewVO reviewVO = reviewDAO.selectReview(reviewNO);
		return reviewVO;
	}

	@Override
	public void modReview(ReviewVO reviewVO) {
		reviewDAO.updateReview(reviewVO);
	}

	@Override
	public void deleteReview(ReviewVO reviewVO) {
		reviewDAO.deleteReview(reviewVO);
	}

	@Override
	public int countReview(String target) {
		return reviewDAO.countReview(target);
	}

	@Override
	public List targetsReview() {
		return reviewDAO.selectTargets();
	}

	@Override
	public int targetReviewCount(String key) {
		return reviewDAO.selectReCountByTarget(key);
	}

	@Override
	public float targetReviewAvg(String key) {
		return reviewDAO.selectReAvgByTarget(key);
	}
}
