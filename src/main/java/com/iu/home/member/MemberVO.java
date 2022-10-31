package com.iu.home.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MemberVO {
	
	@NotBlank
	private String id;
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
