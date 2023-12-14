package com.multi.api;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.client.RestTemplate;

public class û����������_û����å {

	public static void main(String[] args) {
		//url + parameter
		String url = "https://www.youthcenter.go.kr/opi/empList.do";
		String paramter = "?openApiVlak=2853a1265426c8954d6b244d&pageIndex=1&display=10&query=û�����";
		
		//http ��û --> ����(xml)
		RestTemplate rest = new RestTemplate();
		String response = rest.getForObject(url + paramter, String.class);
		//System.out.println(response);
		
		//xml --> json���� 
		JSONObject json = XML.toJSONObject(response);
		System.out.println(json);
		
		//json�м� �� ����(parser, �ļ�) 
		//json�ٱ��ʺ��� ������ �����鼭 ������ ��.
		JSONObject empsInfo = json.getJSONObject("empsInfo");//���� json�� �� 
		JSONArray arr = empsInfo.getJSONArray("emp");//���� jsonarray�� �� 
		System.out.println(arr.getJSONObject(0).getString("bizId"));
		System.out.println(arr.getJSONObject(0).getString("polyBizSjnm"));
		System.out.println(arr.getJSONObject(0).getString("plcyTpNm"));
		System.out.println(arr.getJSONObject(0).getString("cnsgNmor"));
		System.out.println(arr.getJSONObject(0).getString("rqutProcCn"));
	}

}
