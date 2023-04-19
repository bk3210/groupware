package com.ds.gwapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gwapp.domain.UserDTO;
import com.ds.gwapp.repository.UserDAO;

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
	
	@Override
	public UserDTO getView(int userNo) {
		return userDAO.getView(userNo);
	}
	
	@Override
	public void update(UserDTO dto) {
		userDAO.update(dto);
	}
	
	@Override
	public void delete(int userNo) {
		userDAO.delete(userNo);
	}

}
