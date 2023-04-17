package com.ds.gwapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gwapp.domain.DeptDTO;
import com.ds.gwapp.repository.DeptDAO;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;

@Service("deptService")
@Log4j2
public class DeptServiceImpl implements DeptService {
	@Resource(name="deptDAO")
	DeptDAO deptDAO;
	
	@Override
	public List<DeptDTO> getList(DeptDTO dto) {
		return deptDAO.getList(dto);
	}

}
