package com.ds.gwapp.dept.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class deptDTO {
	private String deptNo;
	private String deptId;
	private String deptNm;
	private String DeptOperYn;
}
