package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.WeekDao;
import com.bw.entity.Week;
import com.bw.service.WeekService;
import com.bw.vo.WeekVo;

@Service
public class WeekServiceImpl implements WeekService{

	@Autowired
	private WeekDao dao;

	@Override
	public List<Week> list(WeekVo vo) {
		
		return dao.list(vo);
	}

	@Override
	public int add(Week week) {
		// TODO Auto-generated method stub
		return dao.add(week);
	}
	
	
	
	
}
