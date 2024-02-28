package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.PhoneService;
import com.javaex.vo.PhoneVo;

@Controller
@RequestMapping(value = "phone")
public class PhoneController {
	
	@Autowired
	private PhoneService ps;
	
	@RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("list");
		
		List<PhoneVo> pList = ps.exeList();
		
		model.addAttribute("pList", pList);
		
		return "list";
	}
}
