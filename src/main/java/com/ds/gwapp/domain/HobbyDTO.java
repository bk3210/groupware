package com.ds.gwapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HobbyDTO {
	private int hobbyNo;
	private String hobbyNm;
	
	private int userNo;
	private String userNm;
	
	private int userHobbyHobbyNo;
	private int userHobbyUserNo;

	private String userHobbyCd;

}
