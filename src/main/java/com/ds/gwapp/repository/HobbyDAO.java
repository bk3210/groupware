package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.HobbyDTO;
import com.ds.gwapp.domain.UserDTO;

public interface HobbyDAO {
	List<HobbyDTO> getList(HobbyDTO dto);
	List<HobbyDTO> getMyHobby(int userNo);
	void insertMyHobby(HobbyDTO dto);
	void deleteMyHobby(int userNo);
}
