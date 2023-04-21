package com.ds.gwapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@Resource(name = "userService")
	UserService userService;

	@Resource(name = "deptService")
	DeptService deptService;

	@Resource(name = "hobbyService")
	HobbyService hobbyService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/user/userList")
	public String user_getList(UserDTO userDTO, DeptDTO deptDTO, HobbyDTO hobbyDTO, Model model) {
		List<UserDTO> userList = userService.getList(userDTO);
		List<DeptDTO> deptList = deptService.getList(deptDTO);
		List<HobbyDTO> hobbyList = hobbyService.getList(hobbyDTO);

		model.addAttribute("result", userList);
		model.addAttribute("dept", deptList);
		model.addAttribute("hobby", hobbyList);
		model.addAttribute("searchKey", userDTO.getSearchKey());
		return "userList";
	}

	@RequestMapping(value = "/user/userReg")
	public String userRegPg() {
		return "userReg";
	}

	@ResponseBody
	@PostMapping("/user/save")
	public HashMap<String, String> user_save(UserDTO dto) {
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			map.put("result", "success");
			map.put("msg", "사원 등록이 요청되었습니다.");
			userService.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("result", "fail");
			map.put("msg", "사원 등록에 실패했습니다. 입력을 다시 확인하세요.");
		}
		return map;
	}

	@GetMapping("/user/userList/{userNo}")
	public String getView(@PathVariable("userNo") int userNo, DeptDTO deptDTO, HobbyDTO hobbyDTO, UserDTO userDTO,
			UserDTO dto, Model model) {
		List<UserDTO> userList = userService.getList(userDTO);
		UserDTO resultDTO = userService.getView(userNo);

		List<DeptDTO> deptList = deptService.getList(deptDTO);
		List<HobbyDTO> hobbyList = hobbyService.getList(hobbyDTO);

		List<HobbyDTO> myHobbyList = hobbyService.getMyHobby(userNo);
		/*
		 * System.out.println("myHobbyList start"); System.out.println(myHobbyList);
		 * System.out.println("myHobbyList end");
		 */
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < myHobbyList.size(); i++) {
			buffer.append(myHobbyList.get(i).getUserHobbyHobbyNo());
			if (i < myHobbyList.size() - 1) {
				buffer.append(",");
			}
		}
		model.addAttribute("resultDTO", resultDTO);
		model.addAttribute("result", userList);
		model.addAttribute("dept", deptList);
		model.addAttribute("hobby", hobbyList);
		model.addAttribute("myHobby", buffer);

		return "userList";
	}

	@RequestMapping(value="/user/modify/{userNo}")
	public String user_modify(@PathVariable("userNo") int userNo, UserDTO userDTO, DeptDTO deptDTO, HobbyDTO hobbyDTO,
			Model model) {
		userService.update(userDTO);
		if(hobbyDTO.getUserHobbyHobbyNo()!=0) {
			hobbyService.deleteMyHobby(userNo);
			// hobbyDTO.setUserHobbyHobbyNo(0);		
		}
		
		HobbyDTO hdto = new HobbyDTO();
		int cd = 0;
		if(hobbyDTO.getUserHobbyCd().contains(",")) {
			String[] a = hobbyDTO.getUserHobbyCd().split(",");
			for (int i = 0; i < a.length; i++) {
				cd = Integer.parseInt(a[i]);
				hdto.setUserHobbyHobbyNo(cd);
				// hdto.setUserHobbyUserNo();
				// System.out.println(hdto+"???????????????????????????????????????");
				//hobbyService.insertMyHobby(hdto);			
			}
		}	
		return "redirect:/user/userList";
	}
	
	@RequestMapping(value = "/user/delete/{userNo}")
	public String user_delete(@PathVariable("userNo") int userNo, UserDTO userDTO, HobbyDTO HobbyDTO, Model model) {
		hobbyService.deleteMyHobby(userNo);
		userService.delete(userNo);
		return "redirect:/user/userList";
	}

}