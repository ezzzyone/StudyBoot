package com.iu.home;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iu.home.board.qna.QnaMapper;
import com.iu.home.board.qna.QnaVO;
import com.iu.home.member.MemberVO;
import com.iu.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

//controller anotation
@Controller
@Slf4j
public class HomeComtroller {
	
//	@Value("${my.message.hi}")
//	private String message;
	
	//class input 
	//private final Logger log = LoggerFactory.getLogger(HomeComtroller.class);
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
	@Value("${my.default}")
	private String app;
	
	@GetMapping("/admin")
	@ResponseBody
	public String admin() {
		return "Admin Role";
	}
	
	
	@GetMapping("/manager")
	@ResponseBody
	public String manager() {
		return "Manager Role";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String member() {
		return "Member Role";
	}
	
	@GetMapping("/")
	public String home(HttpSession session)throws Exception{
		
		log.info(app);
		Enumeration<String> en =  session.getAttributeNames();
		log.info("=================this is home=======================");
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			log.info("Key => {}", key);
			
		}
		
		
		SecurityContextImpl context = (SecurityContextImpl)session.getAttribute("SPRING_SECURITY_CONTEXT");
		if(context != null) {
			log.info("Context => {}",context);
		//log.info("Context => {}", ((MemberVO)context.getAuthentication().getPrincipal()).getId());
		//정확히 말하면 MemberVO 아니고 UserDeatail 타입 
		}
		//System.out.println(message);
//		log.error("Error message");
//		log.warn("warn message");
//		log.info("info message");
//		log.debug("debug message");
//		log.trace("trace message");
		
		//List<QnaVO> ar = qnaMapper.getList();
		//log.info("List : {} size {}", ar, ar.size());
		
		return "index";
	}
	
	
	
}
