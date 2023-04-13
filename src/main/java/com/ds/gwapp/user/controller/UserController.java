package com.ds.gwapp.user.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.gwapp.user.domain.UserDTO;
import com.ds.gwapp.user.service.UserService;

import jakarta.annotation.Resource;

@RestController
public class UserController {
	@Resource(name="userService")
	UserService userService;
	
	@RequestMapping("/user/list")
	public HashMap<String, Object> user_getList(UserDTO dto){
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		// dto.setPg(pg-1);
		resultMap.put("result", "success");
		// resultMap.put("totalCnt", userService.getTotalCnt(dto));
		resultMap.put("list", userService.getList(dto));
		return resultMap;
	}
	
	@PostMapping("/user/insert")
	public HashMap<String, Object> user_insert(@RequestBody UserDTO dto){
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("data", dto);
		try {
			resultMap.put("result", "success");
			userService.insert(dto);			
		} catch (Exception e) {
			resultMap.put("result", "fail");
			e.printStackTrace();
		}	
		return resultMap;
	}

}
