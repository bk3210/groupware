package com.ds.gwapp.service;

import java.util.List;

import com.ds.gwapp.domain.HobbyDTO;
import com.ds.gwapp.domain.UserDTO;

public interface HobbyService{
	List<HobbyDTO> getList(HobbyDTO dto);
	List<HobbyDTO> getMyHobby(int userNo);
	void insertMyHobby(HobbyDTO dto);
	void deleteMyHobby(int userNo);

}
