package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PhoneVo;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneDao pd;
	
	public List<PhoneVo> exeList() {
		System.out.println("exeList");
		
		List<PhoneVo> pList = pd.list();
		
		return pList;
	}
}
