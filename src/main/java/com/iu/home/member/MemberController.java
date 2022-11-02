package com.iu.home.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberService memberService;
	
	
	
	@GetMapping("join")
	public void setJoin(@ModelAttribute MemberVO memberVO){
		
	}
	
	@PostMapping("join")
	public ModelAndView setAdd(@Valid MemberVO memberVO, BindingResult bindingResult)throws Exception{
		//@Valid = 검증해라 그리고 BindingResult 에 담아라 . 순서 지켜서 작성
		ModelAndView mv = new ModelAndView();
		
//		if(bindingResult.hasErrors()){
//			//검증 실패하면 회원가입 jsp로 forward
//			mv.setViewName("member/join");
//			return mv;
//		}
		
		boolean check = memberService.getMemberError(memberVO, bindingResult);
	      if(check) {
	         log.info("==========검증 에러 발생==========");
	         mv.setViewName("member/join");
	         
	         //=======================================
		      List<FieldError> error = bindingResult.getFieldErrors();
		     for(FieldError fieldError : error) {
		    	 log.info("+++++++++++++++++++++++++++++++++");
		    	 log.info("fieldError= "+fieldError);
		    	 log.info("getField= "+fieldError.getField());
		    	 log.info("RejectedValue= "+fieldError.getRejectedValue());
		    	 log.info("DefaultMessage= "+fieldError.getDefaultMessage());
		    	 log.info("getCode= "+fieldError.getCode());
		    	 
		    	 mv.addObject(fieldError.getField(),fieldError.getDefaultMessage());
		    	 
		     }
	         return mv;
	      }
//		
//		int result = memberMapper.setMember(memberVO);
//		memberVO.setNum(1);
//		result = memberMapper.setRole(memberVO);
//		
//		
//		if (result>0) {
//			mv.addObject("msg", "조인 성공");
//			mv.addObject("url","/");
//		
//		}else {
//			mv.addObject("msg", "조인 실패");
//			mv.addObject("url", "member/join");
//			throw new Exception();
//		}
//		mv.setViewName("/alert");
	      
			mv.setViewName("redirect:../");
			
			return mv;
		
	}
	
	@GetMapping("login")
	public String getlogin(){
		
		return"member/login";
		
	}
	

	//스프링 시큐리티에서 처리
//	@PostMapping("login")
//	public ModelAndView getlogin(MemberVO memberVO, HttpSession session)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		memberVO = memberMapper.getLogin(memberVO);
//		
//		if (memberVO!=null) {
//			session.setAttribute("member", memberVO);
//			mv.addObject("msg", "로그인 성공");
//			mv.addObject("url","../");
//		}else {
//			mv.addObject("msg", "로그인 실패");
//			mv.addObject("url", "/member/login");
//	
//		}
//		
//		
//		mv.setViewName("/alert");
//		return mv;
//
//		
//	}
	
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session){
		
		ModelAndView mv = new ModelAndView();
		
		session.invalidate();
		mv.addObject("msg","로그아웃 성공");
		mv.addObject("url","/");
		mv.setViewName("/alert");
		
		return mv; 
		
	}

	@GetMapping("idCheck")
	@ResponseBody
	public int idCheck(MemberVO memberVO)throws Exception{
		int result = memberMapper.getIdCheck(memberVO);
		return result;
	}
	
	
	
	
	
	

}
