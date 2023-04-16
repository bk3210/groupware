package com.ds.gwapp.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds.gwapp.user.domain.UserDTO;
import com.ds.gwapp.user.service.UserService;

import jakarta.annotation.Resource;

@Controller
public class UserController {
	@Resource(name = "userService")
	UserService userService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/user/userList")
	public String user_getList(UserDTO dto, Model model) {
		List<UserDTO> resultList = userService.getList(dto);
		model.addAttribute("result", resultList);
		return "userList";
	}

	@RequestMapping(value="/user/userReg")
	public String userRegPg(Model model) {
		model.addAttribute("myform", new UserDTO());
		return "userReg";
	}
	
	@ResponseBody
	@PostMapping("/user/save")
	 public String user_insert(UserDTO dto) {
		userService.insert(dto);
		return "redirect:/";	  
	  }
	 
	/*public HashMap<String, Object> user_insert(UserDTO dto){ 
		HashMap<String, Object> resultMap =	new HashMap<String, Object>();
		resultMap.put("data", dto);
		try {
			resultMap.put("result", "success");
			userService.insert(dto);
		} catch (Exception e) {
			resultMap.put("result","fail");
			e.printStackTrace();
		}
		return resultMap;
		
	}*/

}
