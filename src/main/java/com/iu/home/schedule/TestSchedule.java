package com.iu.home.schedule;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.iu.home.member.MemberMapper;
import com.iu.home.member.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestSchedule {
	
	@Autowired
	private MemberMapper memberMapper;
	
//	@Scheduled(fixedRate = 3000, initialDelayString = "1000")
//	public void ts1(){
//		log.info("Schedule 실행");
//	}
//	
//	public void cron(){
//		log.info(Calendar.getInstance().getTime().toString());
//		MemberVO memberVO = new MemberVO();
//		memberVO.setId("AutoId"+Calendar.getInstance().getTimeInMillis());	
//		memberVO.setPw("123");
//		memberVO.setName("Name");
//		memberVO.setEmail("Email");
////		log.info(memberMapper.setMember(memberVO));
//	
//	}
} 