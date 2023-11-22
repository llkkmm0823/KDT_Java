package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열원소길이 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		// String[] n = { "I", "am", "a", "java programmer" };
		String[] n = { "We", "are", "the", "world!" };
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution9 {
	public int[] solution(String[] n) {
		int[] answer = new int[n.length]; // 답안작성, 글자수카운트
		// {0,0,0,0}
		// n[0].length() --> answer[0]
		// n[1].length() --> answer[1]
		// n[2].length() --> answer[2]
		// n[3].length() --> answer[3]
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i].length();
		}
		return answer;
	}
}