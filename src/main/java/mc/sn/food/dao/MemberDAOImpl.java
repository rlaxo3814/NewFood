package mc.sn.food.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mc.sn.food.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertMember(MemberVO memberVO) {
		int result = 0;
		result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public MemberVO loginByEmail(MemberVO memberVO) {
		MemberVO vo = sqlSession.selectOne("mapper.member.loginByEmail", memberVO);
		return vo;
	}

	@Override
	public int emailChk(MemberVO vo) throws Exception {
		int result = sqlSession.selectOne("mapper.member.emailChk", vo);
		return result;
	}

	@Override
	public MemberVO selectMemberByEmail(String email) throws Exception {
		MemberVO vo = sqlSession.selectOne("mapper.member.selectByEmail", email);
		return vo;
	}

	@Override
	public void updateProfile(Map profileMap) throws Exception {
		sqlSession.update("mapper.member.updateProfile", profileMap);
	}

	@Override
	public int updateMember(MemberVO memberVO) {
		int result = 0;
		result = sqlSession.update("mapper.member.updateMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String email) {
		int result = 0;
		result = sqlSession.delete("mapper.member.deleteMember", email);
		sqlSession.insert("mapper.member.preserveId", email);
		return result;
	}
}
