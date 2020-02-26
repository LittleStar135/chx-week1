package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bw.entity.Week;
import com.bw.service.WeekService;
import com.bw.vo.WeekVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.tools.javac.resources.compiler;

@Controller
public class WeekController {

	
	@Autowired
	private WeekService service;
	
	@RequestMapping("list.do")
	public String list(Model m,WeekVo vo) {
		
		if (vo.getPageNum()==null || "".equals(vo.getPageNum())) {
			vo.setPageNum(1);
		}
		
		PageHelper.startPage(vo.getPageNum(), 2);
		
		List<Week> list = service.list(vo);
		PageInfo<Week> page = new PageInfo<Week>(list);
		m.addAttribute("page", page);
		m.addAttribute("vo", vo);
		m.addAttribute("list", list);
		
		return "list";
		
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("add.do")
	public String add(Model m,@Validated @ModelAttribute Week week,BindingResult br,MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException {
		
		if (!myFile.isEmpty()) {
			
			
			String end = myFile.getOriginalFilename().substring(myFile.getOriginalFilename().lastIndexOf("."));
			String start = UUID.randomUUID().toString();
			File file = new File("F:/LitterOne/chx-week1/src/main/webapp/file/"+start+end);
			System.out.println("****************************"+file);
			myFile.transferTo(file);
			week.setImg(start+end);
			
		}
		int add = service.add(week);
		
		return "redirect:list.do";
		
	}
	
	
}
