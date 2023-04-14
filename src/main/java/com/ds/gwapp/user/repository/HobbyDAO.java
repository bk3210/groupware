package com.ds.gwapp.user.repository;

import java.util.List;

import com.ds.gwapp.user.domain.HobbyDTO;

public interface HobbyDAO {
	List<HobbyDTO> hobbyList(HobbyDTO dto);
	int addHobby(HobbyDTO dto);
	void deleteHobby(HobbyDTO dto);
	int updateHobby(HobbyDTO dto);

}
