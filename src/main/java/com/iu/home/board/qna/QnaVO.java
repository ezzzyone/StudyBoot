package com.iu.home.board.qna;

import org.springframework.web.multipart.MultipartFile;

import com.iu.home.util.QnaFileVO;

import lombok.Data;

@Data
public class QnaVO {
	
	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Long hit;
	private Long ref;
	private Long step;
	private Long depth;
	private MultipartFile [] files;
	private QnaFileVO qnaFileVO;

}
