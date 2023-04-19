package com.ds.gwapp.service;

import java.util.List;

import com.ds.gwapp.domain.UserDTO;

public interface UserService {
	List<UserDTO> getList(UserDTO dto);
	void insert(UserDTO dto);
	UserDTO getView(int userNo);
	void update(UserDTO dto);
	void delete(int userNo);


}
