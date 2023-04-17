package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.DeptDTO;

public interface DeptDAO {
	List<DeptDTO> getList(DeptDTO dto);

}