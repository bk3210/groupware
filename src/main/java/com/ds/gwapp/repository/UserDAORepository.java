package com.ds.gwapp.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.gwapp.domain.UserDTO;


@Repository("userDAO")
public class UserDAORepository implements UserDAO {
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<UserDTO> getList(UserDTO dto) {
		return sm.selectList("User_getList", dto);
	}
	
	@Override
	public void insert(UserDTO dto) {
		sm.insert("User_insert", dto);
	}
	
	@Override
	public void modify(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}
}
