package com.iu.home.util;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.iu.home.board.qna.QnaMapper;
import com.iu.home.board.qna.QnaVO;

import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class FileManageController {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	
	@GetMapping("/fileDown/{p}") //RestFul, RestAPI
	public ModelAndView fileDown(@PathVariable(name = "p") String path, QnaFileVO qnaFileVO)throws Exception{
		log.info("Path : {} ", path);
		
		ModelAndView mv = new ModelAndView();
		//DB에서 정보 조회
//		if(path.equals("qna")) {
//			
//		}else if(path.equals("notice")) 
			qnaFileVO.setFileName("3847a180-7161-4e2a-967f-8441f22a6e4e_.jpg");
		    qnaFileVO.setOriName("2.jpg");
		
		
		mv.addObject("vo", qnaFileVO);
		mv.addObject("path", path);
		mv.setViewName("fileManager");
		
		return mv;
	}
	

}
