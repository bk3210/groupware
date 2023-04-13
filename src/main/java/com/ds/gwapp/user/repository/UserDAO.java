package com.ds.gwapp.user.repository;

import java.util.List;

import com.ds.gwapp.user.domain.UserDTO;

public interface UserDAO {
	List<UserDTO> getList(UserDTO dto);
	void insert(UserDTO dto);

}
