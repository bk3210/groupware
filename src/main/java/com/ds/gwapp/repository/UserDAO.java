package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.UserDTO;

public interface UserDAO {
	List<UserDTO> getList(UserDTO dto);
	void insert(UserDTO dto);
	void modify(UserDTO dto);
	void delete(UserDTO dto);
}
