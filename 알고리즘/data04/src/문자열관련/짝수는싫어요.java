package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		Solution03 s = new Solution03();
		int n = 10;
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution03 {
	public int[] solution(int n) {
		int size = 0;
		if (n % 2 == 0) {
			size = n / 2;
		}else {
			size = n / 2 + 1;
		}
		
		int[] answer = new int[size];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) { //홀수 
				answer[j] = i;
				j++;
			}
		}
		
		return answer;
	}
}