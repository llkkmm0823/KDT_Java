package com.multi.FM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//bean 사용
@Controller
public class ManagerController {
	
	@Autowired
	ReportDAO dao;
	
	@RequestMapping("list")
	public void list(Model model) throws Exception {//예외_하단에 뜨는 팝업 누르기
		List<ReportVO> list = dao.list();
		System.out.println(list.size());
		model.addAttribute("list", list);
	}
}
