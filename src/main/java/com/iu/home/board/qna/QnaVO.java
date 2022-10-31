package com.iu.home.board.qna;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

import com.iu.home.util.QnaFileVO;

import lombok.Data;

@Data
public class QnaVO {
	
	private Long num;
	@NotBlank(message="ID는 꼭 입력해주세요")
	private String title;
	@NotBlank
	private String writer;
	private String contents;
	private Long hit;
	private Long ref;
	private Long step;
	private Long depth;
	private MultipartFile [] files;
	private List<QnaFileVO> qnaFileVOs;

}
