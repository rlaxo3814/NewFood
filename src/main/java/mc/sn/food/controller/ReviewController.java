package mc.sn.food.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mc.sn.food.vo.Criteria;
import mc.sn.food.vo.ReviewVO;

public interface ReviewController {

	public ModelAndView view_reviewForm(@RequestParam("target") String target, @RequestParam("writer") String writer,
			@RequestParam("reqNO") int reqNO, HttpServletRequest request, HttpServletResponse response);

	public ResponseEntity reviewWrite(@ModelAttribute("review") ReviewVO reviewVO, @RequestParam("reqNO") int reqNO,
			@RequestParam("status") String status, HttpServletRequest request, HttpServletResponse response);

	public ModelAndView view_reviewInfo(@RequestParam("target") String target, HttpServletRequest request,
			HttpServletResponse response, Criteria cri);

	public ResponseEntity modifyReview(@ModelAttribute("review") ReviewVO reviewVO, HttpServletRequest request,
			HttpServletResponse response);

	public ResponseEntity deleteReview(@ModelAttribute("review") ReviewVO reviewVO, HttpServletRequest request,
			HttpServletResponse response);
}