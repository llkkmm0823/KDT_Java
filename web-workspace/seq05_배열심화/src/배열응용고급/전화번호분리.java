package 배열응용고급;

import java.util.Arrays;

public class 전화번호분리 {

	public static void main(String[] args) {
		String tel = "   011-245-1234  ";
		String tel2 = tel.trim();
		
		System.out.println(tel.indexOf("0"));
		System.out.println(tel2);

		String[] tel3 = tel2.split("-");
		System.out.println(Arrays.toString(tel3));

		if (tel3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int sum = 0;
		for (String x : tel3) {
			sum = sum + x.length();
		}
		System.out.println(sum);
		if (sum >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 전화번호");

		}
	}
}
