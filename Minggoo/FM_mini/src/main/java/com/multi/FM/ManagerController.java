package com.multi.FM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	
	@Autowired
	ReportDAO dao;
	
//주석추가하기
	@RequestMapping("list")
	public void list(Model model) throws Exception {
		List<ReportVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
}
