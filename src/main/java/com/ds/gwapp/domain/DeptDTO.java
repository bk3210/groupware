package com.ds.gwapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DeptDTO {
	private int deptNo;
	private String deptId;
	private String deptNm;
	private String DeptOperYn;
}
