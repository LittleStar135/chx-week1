package com.bw.service;

import java.util.List;

import com.bw.entity.Week;
import com.bw.vo.WeekVo;

public interface WeekService {

	List<Week> list(WeekVo vo);
	
	int add(Week week);
	
}
