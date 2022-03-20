package mc.sn.food.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.WriterVO;

@Repository("writerDAO")
public class WriterDAOImpl implements WriterDAO {
	@Autowired
	private SqlSession sqlSession;

	// 새 코칭 글 삽입
	@Override
	public int insertNewWriter(Map writerMap) {
		int writerNO = this.selectNewWriterNO();
		writerMap.put("writerNO", writerNO);
		sqlSession.insert("mapper.coach.insertNewWriter", writerMap);
		return writerNO;
	}

	// 코칭 글 넘버링
	private int selectNewWriterNO() {
		return sqlSession.selectOne("mapper.coach.selectNewWriterNO");
	}

	// 코칭 글 전체 조회
	@Override
	public List selectAllWritersList(Criteria cri) throws DataAccessException {
		List<WriterVO> writersList = sqlSession.selectList("mapper.coach.selectAllWritersList", cri);
		return writersList;
	}

	// 코칭 글 상세 정보 조회
	@Override
	public WriterVO selectWriter(int writerNO) throws DataAccessException {
		return sqlSession.selectOne("mapper.coach.selectWriter", writerNO);
	}

	// 코칭 글 수정
	@Override
	public void updateWriter(Map writerMap) throws DataAccessException {
		sqlSession.update("mapper.coach.updateWriter", writerMap);
	}

	// 코칭 글 삭제
	@Override
	public void deleteWriter(int writerNO) throws DataAccessException {
		sqlSession.delete("mapper.coach.deleteWriter", writerNO);
	}

	// 코칭 글 개수
	@Override
	public int countWriter(Criteria cri) throws DataAccessException {
		return (Integer) sqlSession.selectOne("mapper.coach.countWriter", cri);
	}

}
