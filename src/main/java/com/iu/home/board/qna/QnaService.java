package com.iu.home.board.qna;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.iu.home.util.FileManager;
import com.iu.home.util.QnaFileVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	
	@Value("${app.upload.path}")
	private String path;
	
	@Autowired
	private FileManager fileManager;
	
	public int setList(QnaVO qnaVO)throws Exception{
		
	    int result = qnaMapper.setList(qnaVO);

		//String realPath = session.getServletContext().getRealPath("/static/upload/qna");
		
		log.info("Path : {} "+path);
		
		File file = new File(path);
		if(!file.exists()){
			boolean check = file.mkdirs();
			log.info("check : {}"+check);
		}
		

		for(MultipartFile mf : qnaVO.getFiles()) {
			if(mf.isEmpty()) {
				log.info("------------- Exception 발생-----------");
				throw new Exception();
			}
		      
		      
	
		         if(!mf.isEmpty()) {
		            log.info("FileName : {} ", mf.getOriginalFilename());
		            String fileName = fileManager.saveFile(mf, path);
		            QnaFileVO qnaFileVO = new QnaFileVO();
		            qnaFileVO.setFileName(fileName);
		            qnaFileVO.setOriName(mf.getOriginalFilename());
		            qnaFileVO.setNum(qnaVO.getNum());
		            qnaMapper.setFileAdd(qnaFileVO);
		         }
		      
		}
		      return result;
		  
	}
}
