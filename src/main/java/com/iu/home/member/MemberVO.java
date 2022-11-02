package com.iu.home.member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class MemberVO implements UserDetails{
	//UserDetails = 스프링에서 로그인 처리하기위한 VO같은 개념상속 
	
	@NotBlank
	private String id;
	
	private List<RoleVO> roleVOs;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//권한부여 
		//? = any
		//? extends GrantedAuthority = GrantedAuthority를 상속받은것 어느것이나 
		List<GrantedAuthority> authorities = new ArrayList<>();
		for(RoleVO roleVO : roleVOs) {
		authorities.add(new SimpleGrantedAuthority(roleVO.getRoleName()));
		}
		return null;
	}
	@Override
	public String getPassword() {
		// pw 반환 
		return this.pw;
	}
	@Override
	public String getUsername() {
		// id 반환 
		return this.id;
	}
	@Override
	public boolean isAccountNonExpired() {
		// 사용자 계정의 만료 여부 . 	true = 만료 안됨 // false = 만료. 로그인 불가 
		//만료되지 않았습니까? 
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// 계정 잠김 여부 . 	true = 계정 오픈  // false =잠김 . 로그인 불가 
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// 비밀번호 만료 여부 
		return false;
	}
	@Override
	public boolean isEnabled() {
		// 계정 사용 여부 . true = 계정 활성화. 사용 가능 
		return false;
	}
	@Size(max =10, min =4)
	private String pw;
	private String pw2;
	@NotBlank
	private String name;
	@Email
	@NotBlank
	private String email;
	private Boolean enabled;
	private int num;
	private RoleVO roleVO;
	
	

}
