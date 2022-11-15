package com.iu.home;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.iu.home.member.MemberMapper;
import com.iu.home.member.MemberVO;
@SpringBootTest
class Test {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@org.junit.jupiter.api.Test
	void test() throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("admin1");
		memberVO.setPw(passwordEncoder.encode("admin1"));
		memberVO.setName("admin1");
		memberVO.setEmail("admin1@gmail.com");
		int result = memberMapper.setMember(memberVO);
//		assertEquals(1, result);
	}

}
