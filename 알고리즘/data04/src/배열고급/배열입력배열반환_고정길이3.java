package 배열고급;

import java.util.Arrays;

public class 배열입력배열반환_고정길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution3 s = new Solution3();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] n) {
		//정렬을 한 이후에 모든 값에 100을 곱해서 리턴!
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		//수도코드(pseudo code, 가짜코드)
		//1~3까지를 배열의 길이만큼 반복한다.(for)
		//-----------------------------------------
			//1. n이 가르키고 있는 데이터를 하나씩 꺼내서 
			//2. 100을 곱한 후
			//3  answer배열에 하나씩 넣는다. 
		//-----------------------------------------
		int[] answer = new int[n.length]; //answer.length == n.length
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i] * 100;
		}
		return answer;
	}
}