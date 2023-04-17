package com.ds.gwapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @AllArgsConstructor : 객체 내부의 인스턴스 멤버들을 모두 가진 생성자를 생성
// @NoArgsConstructor : 멤버변수가 없는 생성자(기본생성자) 생성
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDTO {
	private String userNo;
	private String userId;
	private String userNm;
	private String userEmlAddr;
	private String userDeptNo;
	private String userTelno;
	private String userAddr;
	private String userAprvYn;
	
	private String deptNo;
	private String deptNm;

}
