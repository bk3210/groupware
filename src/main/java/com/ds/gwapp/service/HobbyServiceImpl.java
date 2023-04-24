package com.ds.gwapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gwapp.domain.HobbyDTO;
import com.ds.gwapp.domain.UserDTO;
import com.ds.gwapp.repository.HobbyDAO;

import javax.annotation.Resource;
@Service("hobbyService")
public class HobbyServiceImpl implements HobbyService {
	@Resource(name="hobbyDAO")
	HobbyDAO hobbyDAO;
	
	
	@Override
	public List<HobbyDTO> getList(HobbyDTO dto) {
		return hobbyDAO.getList(dto);
	}
	
	@Override
	public List<HobbyDTO> getMyHobby(int userNo) {
		return hobbyDAO.getMyHobby(userNo);
	}
	
	@Override
	public int insertMyHobby(HobbyDTO dto) {
		return hobbyDAO.insertMyHobby(dto);
	}
	
	
	@Override
	public void deleteMyHobby(int userNo) {
		hobbyDAO.deleteMyHobby(userNo);
	}
	
	
}
