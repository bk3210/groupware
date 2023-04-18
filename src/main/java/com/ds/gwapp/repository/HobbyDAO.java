package com.ds.gwapp.repository;

import java.util.List;

import com.ds.gwapp.domain.HobbyDTO;

public interface HobbyDAO {
	List<HobbyDTO> getList(HobbyDTO dto);
	List<HobbyDTO> getMyHobby(int userNo);
}
