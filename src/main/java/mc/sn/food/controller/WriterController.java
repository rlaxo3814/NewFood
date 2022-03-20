package mc.sn.food.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.food.vo.Criteria;

public interface WriterController {
	// 코치글 게시창
	public ModelAndView view_writerCate(HttpServletRequest request, HttpServletResponse response, Criteria cri)
			throws Exception;
	//코치 내용 입력
	public ModelAndView view_writerWrite(HttpServletRequest request, HttpServletResponse response) throws Exception;
	//코치 추가
	public ResponseEntity addNewWriter(MultipartHttpServletRequest multipartRequest, HttpServletResponse response)
			throws Exception;
	//코치 이미지 다운로드
	public void download(@RequestParam("wImg") String wImg, @RequestParam("writer") String writer,
			@RequestParam("writerNO") int writerNO, HttpServletResponse response) throws Exception;
	//코치 정보 입력
	public ModelAndView writerInfo(@RequestParam("writerNO") int writerNO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	//코치 삭제 입력
	public ResponseEntity removeWriter(@RequestParam("writerNO") int coachNO, @RequestParam("writer") String writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception;
}
