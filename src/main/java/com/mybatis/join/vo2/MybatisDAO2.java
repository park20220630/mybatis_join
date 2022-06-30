package com.mybatis.join.vo2;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDAO2 {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<SjoinVO> selectListJoin(SjoinVO vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ��");
		return mybatis.selectList("sjoin.selectListJoin", vo);
	}
	
	
}
