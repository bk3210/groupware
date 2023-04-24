package com.ds.gwapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HobbyDTO {
	private int hobbyNo;
	private String hobbyNm;
	
	private int userNo;
	private String userNm;
	
	private int userHobbyHobbyNo;
	private int userHobbyUserNo;

	private String userHobbyCd;

}
