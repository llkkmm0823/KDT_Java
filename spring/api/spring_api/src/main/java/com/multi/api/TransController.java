package com.multi.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransController {

	@RequestMapping("trans.jsp")
	public void trans(String ko,Model model, ���̹���������2 naver) {
		//���̹���������2 naver = new ���̹���������2();
		String en = naver.trans(ko);
		model.addAttribute("en", en);
	}
}
