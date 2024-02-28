package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhoneVo;

@Repository
public class PhoneDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<PhoneVo> list() {
		System.out.println("1");
		
		List<PhoneVo> pList = sqlSession.selectList("phonebook.list");
		
		return pList;
	}
}
