package com.bw.dao;

import java.util.List;

import com.bw.entity.Week;
import com.bw.vo.WeekVo;

public interface WeekDao {

	List<Week> list(WeekVo vo);
	
	int add(Week week);
	
	
}
