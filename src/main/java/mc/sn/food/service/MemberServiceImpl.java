package mc.sn.food.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.sn.food.dao.MemberDAO;
import mc.sn.food.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	// 회원가입
	@Override
	public int joinMember(MemberVO member) {
		int result = 0;
		result = memberDAO.insertMember(member);
		return result;
	}

	// 로그인
	@Override
	public MemberVO login(MemberVO memberVO) {
		return memberDAO.loginByEmail(memberVO);
	}

	// 중복확인
	@Override
	public int emailChk(MemberVO vo) throws Exception {
		int result = memberDAO.emailChk(vo);
		return result;
	}

	// 회원 검증 - 로그인
	@Override
	public MemberVO searchMember(String email) throws Exception {
		return memberDAO.selectMemberByEmail(email);
	}

	// 프로필 수정
	@Override
	public void modProfile(Map profileMap) throws Exception {
		memberDAO.updateProfile(profileMap);
	}

	// 회원정보 수정
	@Override
	public int modifyMember(MemberVO member) {
		int result = 0;
		result = memberDAO.updateMember(member);
		return result;
	}

	// 회원탈퇴
	@Override
	public int dropMember(String email) {
		int result = 0;
		result = memberDAO.deleteMember(email);
		return result;
	}
}
