package com.multi.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class �ܱ���_�ڷγ��ֽżҽ� {
	public static void main(String[] args) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1262000/SafetyNewsList/getCountrySafetyNewsList"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=63Jk4KYSAeT0Kif97Z6jQm7H4vk6jMJSJ29jfJB4wMtKA%2FDfN7igbdpFRmXbS%2BfopaXmPMqvIhJWeVLeuy2DXw%3D%3D"); /*
																														 * Service
																														 * Key
																														 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("2", "UTF-8")); /* �� ������ ��� �� */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* ��������ȣ */
		urlBuilder
				.append("&" + URLEncoder.encode("title1", "UTF-8") + "=" + URLEncoder.encode("�Ա�", "UTF-8")); /* ����1 */
		urlBuilder
				.append("&" + URLEncoder.encode("title2", "UTF-8") + "=" + URLEncoder.encode("�ڷγ�", "UTF-8")); /* ����2 */
		urlBuilder
				.append("&" + URLEncoder.encode("title3", "UTF-8") + "=" + URLEncoder.encode("����", "UTF-8")); /* ����3 */
		urlBuilder
				.append("&" + URLEncoder.encode("title4", "UTF-8") + "=" + URLEncoder.encode("�װ���", "UTF-8")); /* ����4 */
		urlBuilder
				.append("&" + URLEncoder.encode("title5", "UTF-8") + "=" + URLEncoder.encode("�ݸ�", "UTF-8")); /* ����5 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/xml");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());

		JSONObject json1 = XML.toJSONObject(sb.toString());
		//System.out.println(json1);
		//{response: {header: {}, body{items:[{item: {}, item: {}, ....]}}}
		JSONObject response = json1.getJSONObject("response");
		//System.out.println(response);
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("items");

		JSONArray array = items.getJSONArray("item");
		for (int i = 0; i < array.length(); i++) {
			System.out.println(array.getJSONObject(i).getString("countryEnName"));
			System.out.println(array.getJSONObject(i).getString("fileUrl"));
			System.out.println(array.getJSONObject(i).getString("countryName"));
		}
	}
}
