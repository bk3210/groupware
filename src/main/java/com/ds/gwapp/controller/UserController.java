package com.ds.gwapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.gwapp.domain.DeptDTO;
import com.ds.gwapp.domain.HobbyDTO;
import com.ds.gwapp.domain.UserDTO;
import com.ds.gwapp.service.DeptService;
import com.ds.gwapp.service.HobbyService;
import com.ds.gwapp.service.UserService;

import jakarta.annotation.Resource;

@Controller
public class UserController {
	@Resource(name="userService")
	UserService userService;
	
	@Resource(name="deptService")
	DeptService deptService;
	
	@Resource(name="hobbyService")
	HobbyService hobbyService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/user/userList")
	public String user_getList(UserDTO userDTO, DeptDTO deptDTO, HobbyDTO hobbyDTO, Model model) {
		List<UserDTO> userList = userService.getList(userDTO);
		List<DeptDTO> deptList = deptService.getList(deptDTO);
		List<HobbyDTO> hobbyList = hobbyService.getList(hobbyDTO);
		System.out.println(deptList.get(0).getDeptNm());
		System.out.println(hobbyList.get(0).getHobbyNm());
		model.addAttribute("result", userList);
		model.addAttribute("dept", deptList);
		model.addAttribute("hobby", hobbyList);
		return "userList";
	}

	@RequestMapping(value="/user/userReg")
	public String userRegPg() {
		return "userReg";
	}
	
	@ResponseBody
	@PostMapping("/user/save")
	public HashMap<String, String> user_save(UserDTO dto){
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			map.put("result", "success");
			map.put("msg", "사원 등록이 요청되었습니다.");
			userService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", "fail");
			map.put("msg", "사원 등록에 실패했습니다.");
		}
		return map;
	}
	
	/*
	 * @GetMapping("/user/userList")
	 * public String
	 */

}
