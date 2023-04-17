package com.ds.gwapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ds.gwapp.domain.HobbyDTO;
import com.ds.gwapp.repository.HobbyDAO;

import jakarta.annotation.Resource;

@Service("hobbyService")
public class HobbyServiceImpl implements HobbyService {
	@Resource(name="hobbyDAO")
	HobbyDAO hobbyDAO;
	
	
	@Override
	public List<HobbyDTO> getList(HobbyDTO dto) {
		return hobbyDAO.getList(dto);
	}
}
