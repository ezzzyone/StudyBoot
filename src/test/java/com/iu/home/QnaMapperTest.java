package com.iu.home;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.home.board.qna.QnaMapper;
import com.iu.home.board.qna.QnaVO;

@SpringBootTest
class QnaMapperTest {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QnaMapper qnaMapper;
	
//	//전체 test 실행 전
//	@BeforeAll
//	static void beforeAll(){
//		System.out.println("전체 테스트 실행 전");
//	}
//	
//	@AfterAll
//	static void afterAll(){
//		System.out.println("전체 테스트 실행 후 ");
//	}
//	
//	//각각의 testcase 메서드 실행 전
//	@BeforeEach
//	static void beforeEach(){
//		System.out.println("전체 테스트 실행 후 ");
//	}
//	
//	@AfterEach
//	static void afterEach(){
//		System.out.println("전체 테스트 실행 후 ");
//	}

//	@Test
//	void test() throws Exception{
//		QnaVO qnaVO = new QnaVO();
//		for(int i=0; i<50; i++) {
//			qnaVO.setWriter("jw"+i);
//			qnaVO.setTitle("title");
//			qnaVO.setContents("contents");
//			int result = qnaMapper.setList(qnaVO);
//			String rs = String.valueOf(result);
//		}
//	}

}
