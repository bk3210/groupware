package com.ds.gwapp.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
