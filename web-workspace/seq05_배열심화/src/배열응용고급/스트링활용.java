package 배열응용고급;

import java.util.Arrays;

public class 스트링활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		System.out.println(Arrays.toString(s2));
		System.out.println(s2.length);
		System.out.println(s2[0]);
		
		String s3 = "    홍길동";
		System.out.println(s3.trim());
		s3 = s3.replace("    ", "");		
		System.out.println(s3);
		
		String s6 = "홍길동";
		char c6 = s6.charAt(0);
		if (c6 == '홍') {
			System.out.println("홍씨 가문이시군요.!");
		} else {
			System.out.println("홍씨 가문이 아니시군요.!");
		}
		
		char[] c7 = s6.toCharArray(); //{'홍','길','동'}
		System.out.println(c7[0]);
		
		
	}

}
