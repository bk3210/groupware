package com.ds.gwapp.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gwapp.user.domain.UserDTO;
import com.ds.gwapp.user.repository.UserDAO;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;

@Service("userService")
@Log4j2
public class UserServiceImpl implements UserService {
	@Resource(name="userDAO")
	UserDAO userDAO;
	
	@Override
	public List<UserDTO> getList(UserDTO dto) {
		return userDAO.getList(dto);
	}	
	
	@Override
	public void insert(UserDTO dto) {
		userDAO.insert(dto);
	}
	

}
