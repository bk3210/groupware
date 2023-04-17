package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.HobbyDTO;

public interface HobbyDAO {
	List<HobbyDTO> getList(HobbyDTO dto);
	int addHobby(HobbyDTO dto);
	void deleteHobby(HobbyDTO dto);
	int updateHobby(HobbyDTO dto);

}
