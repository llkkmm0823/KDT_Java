package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	//요청하나당 함수하나.
	@RequestMapping("insert2")
	public void insert2() {
		//db처리 --> views/insert2.jsp결과를 출력해주세요.
	}
}
