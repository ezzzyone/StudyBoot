package com.iu.home.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("join")
	public String setJoin(){
		
		return"member/join";
		
	}
	
	@PostMapping("join")
	public ModelAndView setJoin(MemberVO memberVO)throws Exception{
		
	ModelAndView mv = new ModelAndView();
		
		int result = memberMapper.setMember(memberVO);
		memberVO.setNum(1);
		result = memberMapper.setRole(memberVO);
		
		
		if (result>0) {
			mv.addObject("msg", "조인 성공");
			mv.addObject("url","/");
		
		}else {
			mv.addObject("msg", "조인 실패");
			mv.addObject("url", "member/join");
			throw new Exception();
		}
		mv.setViewName("/alert");
		
		return mv;
		
	}
	
	@GetMapping("login")
	public String getlogin(){
		
		return"member/login";
		
	}
	
	
	@PostMapping("login")
	public ModelAndView getlogin(MemberVO memberVO, HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO = memberMapper.getLogin(memberVO);
		
		if (memberVO!=null) {
			session.setAttribute("member", memberVO);
			mv.addObject("msg", "로그인 성공");
			mv.addObject("url","../");
		}else {
			mv.addObject("msg", "로그인 실패");
			mv.addObject("url", "/member/login");
	
		}
		
		
		mv.setViewName("/alert");
		return mv;

		
	}
	
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
	public int idCheck(String id)throws Exception{
		int result = memberMapper.getIdCheck(id);
//		공통 ajax 에러 xhr 처리 콘솔 확인 	
//		if(result==0) {
//			throw 
//		}
		return result;
	}
	
	@PostMapping("test")
	@ResponseBody
	public int test(String[] ar, String id)throws Exception{
		log.info("========ar: "+ar[1]);
		int result = memberMapper.getIdCheck(id);
		return result;
	}
	
	

	
	
	
	
	
	

}
