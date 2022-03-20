package mc.sn.food.service;

import java.util.List;
import java.util.Map;

import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.WriterVO;

public interface WriterService {

	public int addNewWriter(Map writerMap);

	public List<WriterVO> listWriters(Criteria cri) throws Exception;

	public WriterVO viewWriter(int writerNO) throws Exception;

	public void modWriter(Map writerMap) throws Exception;

	public void removeWriter(int writerNO) throws Exception;

	public int countWriter(Criteria cri) throws Exception;

}
