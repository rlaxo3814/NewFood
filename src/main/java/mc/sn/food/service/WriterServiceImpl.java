package mc.sn.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mc.sn.food.dao.WriterDAO;
import mc.sn.food.service.WriterService;
import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.WriterVO;

@Service("writerService")
@Transactional(propagation = Propagation.REQUIRED)
public class WriterServiceImpl implements WriterService {
	@Autowired
	private WriterDAO writerDAO;

	// 새 코칭 글 삽입
	@Override
	public int addNewWriter(Map writerMap) {
		return writerDAO.insertNewWriter(writerMap);
	}

	// 코칭 글 전체 조회
	public List<WriterVO> listWriters(Criteria cri) throws Exception {
		List<WriterVO> writersList = writerDAO.selectAllWritersList(cri);
		return writersList;
	}

	// 코칭 글 상세 조회 창 호출
	@Override
	public WriterVO viewWriter(int writerNO) throws Exception {
		WriterVO writerVO = writerDAO.selectWriter(writerNO);
		return writerVO;
	}

	// 코칭 글 수정
	@Override
	public void modWriter(Map writerMap) throws Exception {
		writerDAO.updateWriter(writerMap);
	}

	// 코칭 글 삭제
	@Override
	public void removeWriter(int writerNO) throws Exception {
		writerDAO.deleteWriter(writerNO);
	}

	// 코칭 글 개수
	@Override
	public int countWriter(Criteria cri) throws Exception {
		return writerDAO.countWriter(cri);
	}
}
