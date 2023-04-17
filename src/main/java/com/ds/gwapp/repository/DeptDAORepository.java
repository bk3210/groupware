package com.ds.gwapp.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.gwapp.domain.DeptDTO;

@Repository("deptDAO")
public class DeptDAORepository implements DeptDAO {
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<DeptDTO> getList(DeptDTO dto) {
		return sm.selectList("Dept_getList", dto);
	}

}