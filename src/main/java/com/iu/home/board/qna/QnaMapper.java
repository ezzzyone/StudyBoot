package com.iu.home.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iu.home.member.MemberVO;
import com.iu.home.util.Pager;
import com.iu.home.util.QnaFileVO;

@Mapper
public interface QnaMapper {
	
	public List<QnaVO> getList(Pager pager)throws Exception;
	
	public Long getListCount(Pager pager)throws Exception;
	
	public int setList(QnaVO qnaVO)throws Exception;
	
	public QnaVO getDetail(QnaVO qnaVO)throws Exception;
	
	public int setFileAdd(QnaFileVO qnaFileVO)throws Exception;
	
	public QnaFileVO getFile(QnaFileVO qnaFileVO)throws Exception;


}
