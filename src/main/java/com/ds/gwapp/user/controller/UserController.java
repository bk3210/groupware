package com.ds.gwapp.user.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ds.gwapp.user.domain.UserDTO;
import com.ds.gwapp.user.service.UserService;

import org.springframework.ui.Model;
import jakarta.annotation.Resource;

@Controller
public class UserController {
	@Resource(name = "userService")
	UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value="/user/userReg")
	public String userRegPg() {
		return "userReg";
	}

	@RequestMapping(value="/user/userList")
	public String user_getList(UserDTO dto, Model model) {
		List<UserDTO> resultList = userService.getList(dto);
		model.addAttribute("result", resultList);
		return "userList";
	}
	
	@PostMapping("/user/save")
	public HashMap<String, Object> user_insert(@RequestBody UserDTO dto){ 
		HashMap<String, Object> resultMap =	new HashMap<String, Object>();
		resultMap.put("data", dto);
		try {
			resultMap.put("result", "success");
			userService.insert(dto);
		} catch (Exception e) {
			resultMap.put("result","fail"); e.printStackTrace();
		}
		return resultMap;
		
	}

}
