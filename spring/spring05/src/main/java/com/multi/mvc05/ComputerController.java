package com.multi.mvc05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComputerController {

	@RequestMapping("computer")
	public void computer(ComputerVO vo) {
		System.out.println(vo);
	}
}
