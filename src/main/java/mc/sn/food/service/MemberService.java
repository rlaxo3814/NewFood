package mc.sn.food.service;

import java.util.Map;

import mc.sn.food.vo.MemberVO;

public interface MemberService {

	public int joinMember(MemberVO member);

	public MemberVO login(MemberVO memberVO);

	public int emailChk(MemberVO vo) throws Exception;

	public MemberVO searchMember(String email) throws Exception;

	public void modProfile(Map profileMap) throws Exception;

	public int modifyMember(MemberVO member);

	public int dropMember(String email);
}
