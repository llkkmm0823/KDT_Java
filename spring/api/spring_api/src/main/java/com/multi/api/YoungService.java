package com.multi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YoungService {

	@Autowired
	YoungDAO youngDAO;
	
	public void insert() {
		//��ó���� ���� ������ ���ּ���.
		û����������_û����å2 young = new û����������_û����å2();
		YoungVO youngVO = young.parse();
		youngDAO.insert(youngVO);
	}
}
