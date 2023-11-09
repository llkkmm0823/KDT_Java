package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤 + 컨트롤러 등록
public class BbsController {

	// 요청하나당 함수하나.
	@RequestMapping("insert2")
	public void insert2(BbsDTO2 bag, Model model) {
		System.out.println(bag);
		// db처리 --> views/insert2.jsp결과를 출력해주세요.
		BbsDAO dao = new BbsDAO();
		int result = dao.insert(bag);
		System.out.println(result);
		// result는 views/아래까지 가지고 가야하는 속성값이야 설정!!!
		// views까지 데이터를 넘길 수 있는 객체 필요(Model)
		// 함수(Model model)써놓으면 스프링이 model객체를 만들어서 넣어준다.
		model.addAttribute("result", result);
	}

	@RequestMapping("update2")
	public String update2(BbsDTO2 bag) {
		BbsDAO dao = new BbsDAO();
		int result = dao.update(bag);
		// views에 update2.jsp를 만드세요.
		if (result == 1) {
			return "redirect:bbs.jsp"; // views/ok.jsp
		} else {
			return "no"; // views/no.jsp
		}
	}

	@RequestMapping("delete2")
	public void delete2(BbsDTO2 bag, Model model) {
		// bag에 넣고
		// dao를 이용해서 db처리하고
		BbsDAO dao = new BbsDAO();
		int result = dao.delete(bag);
		// views/delete2.jsp를 만들어서 결과를 출력
		model.addAttribute("result", result);
	}

}
