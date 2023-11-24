package 문자열관련;

import java.util.Arrays;

public class 문자열정렬하기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello2";
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		Arrays.sort(b);
		Arrays.sort(a);
		System.out.println(Arrays.equals(a, b));
	}
}
