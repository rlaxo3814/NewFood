package mc.sn.food.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.WriterVO;

public interface WriterDAO {

	public int insertNewWriter(Map writerMap);

	public List selectAllWritersList(Criteria cri) throws DataAccessException;

	public WriterVO selectWriter(int writerNO) throws DataAccessException;

	public void updateWriter(Map writerMap) throws DataAccessException;

	public void deleteWriter(int writerNO) throws DataAccessException;

	public int countWriter(Criteria cri) throws DataAccessException;

	
}
