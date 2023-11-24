package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 수박수박수박 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int n = 10;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution7 {
	public String solution(int x) {
		String answer = "";
		for (int i = 0; i < x; i++) {//0~2, 3번 
			//0, 1, 2
			//수 박 수 
			//i가 짝수일때는 수 
			//i가 홀수일때는 박
			if (i % 2 == 0) { //짝수 
				answer = answer + "수";
			} else { //홀수 
				answer = answer + "박";
			}
		}
		return answer;
	}
}