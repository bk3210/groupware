package com.ds.gwapp.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.gwapp.domain.HobbyDTO;

@Repository("hobbyDAO")
public class HobbyDAORepository implements HobbyDAO {
	@Autowired
	SqlSessionTemplate sm;

	@Override
	public List<HobbyDTO> getList(HobbyDTO dto) {
		return sm.selectList("Hobby_getList", dto);
	}
	
	@Override
	public List<HobbyDTO> getMyHobby(int userNo) {
		return sm.selectList("Hobby_getMyHobby", userNo);
	}
	
	@Override
	public void insertMyHobby(HobbyDTO dto) {
		sm.insert("Hobby_insertMyHobby");
	}
	
	@Override
	public void updateMyHobby(HobbyDTO dto) {
		sm.update("Hobby_updateMyHobby");
	}
	
	@Override
	public void deleteMyHobby(int userNo) {
		sm.delete("Hobby_deleteMyHobby");
	}

}
