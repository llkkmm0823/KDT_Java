package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버크롤링 {
	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com"); 
		//Connection
		System.out.println(conn);
		try {
			Document doc = conn.get();
			System.out.println(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //연결한 사이트에서 코드 다 가지고오기
		//html문서에 대한 코드 Document
		
	}

}
