package 문자열관련;

import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		String before = "Bcad";
		String after = before.toLowerCase();
		char[] c = after.toCharArray();
		Arrays.sort(c);
		//String answer = new String(c);
		String answer = "";
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i];
		}
		System.out.println(answer);
	}
}
