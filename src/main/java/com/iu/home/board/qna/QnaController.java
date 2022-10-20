package com.iu.home.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.iu.home.util.Pager;
@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Autowired
	private QnaService qnaService;
	
//	@ModelAttribute("board")
//	public String getBoard() {
//		return "qna";
//	}
	
	@GetMapping("list")
	public ModelAndView list(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		pager.getRowNum();
		System.out.println("StartRow"+pager.getStartRow());
		System.out.println("perpage"+pager.getPerPage());
		Long c = qnaMapper.getListCount(pager); //카운트가 안뽑힘
		System.out.println("getListCount"+c);
		pager.getNum(qnaMapper.getListCount(pager));
		List<QnaVO> ar = qnaMapper.getList(pager);
		
		mv.addObject("vo", ar);
		mv.setViewName("board/list");
		
		return mv;
	}
	
	@GetMapping("write")
	public String write()throws Exception{
		return "./board/write";
	}
	
	@PostMapping("write")
	public String write(QnaVO qnaVO, RedirectAttributes redirectAttributes)throws Exception{
		
		int result = qnaService.setList(qnaVO);
		redirectAttributes.addAttribute("result", result);
		return "redirect:./list";
	}
	
	@GetMapping("detail")
	public ModelAndView detail(QnaVO qnaVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaVO = qnaMapper.getDetail(qnaVO);
		
		mv.addObject("vo", qnaVO);
		mv.setViewName("board/detail");
		return mv;
	}

}
