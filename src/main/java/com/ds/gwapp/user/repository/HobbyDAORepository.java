package com.ds.gwapp.user.repository;

import java.util.List;

import com.ds.gwapp.user.domain.HobbyDTO;

public class HobbyDAORepository implements HobbyDAO {

	@Override
	public List<HobbyDTO> hobbyList(HobbyDTO dto) {
		return null;
	}
	
	@Override
	public int addHobby(HobbyDTO dto) {
		return 0;
	}

	@Override
	public void deleteHobby(HobbyDTO dto) {
		
	}

	@Override
	public int updateHobby(HobbyDTO dto) {
		return 0;
	}

}
