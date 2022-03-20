package mc.sn.food.dao;

import java.util.Map;

import mc.sn.food.vo.MemberVO;

public interface MemberDAO {

	public int insertMember(MemberVO memberVO);

	public MemberVO loginByEmail(MemberVO memberVO);

	public int emailChk(MemberVO vo) throws Exception;

	public MemberVO selectMemberByEmail(String email) throws Exception;

	public void updateProfile(Map profileMap) throws Exception;

	public int updateMember(MemberVO memberVO);

	public int deleteMember(String email);
}
