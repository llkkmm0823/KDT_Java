package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기_짝수 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] numbers = {0, 31, 24, 10, 1, 9, 11, 12};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = 0;
		//배열에 들어간 개수가 짝수인 경우에 
		//중앙값 2개를 구해서 더해서 리턴해주세요.!
		
		//1. 정렬!!! --> 오름차순 
		Arrays.sort(numbers);
		Print.arr(numbers);
		//2. 중앙위치(2개) -- 홀수처럼 찾으면
		//				중앙위치중에서 뒤의 것을 찾아줌.
		int median = numbers.length / 2;
		int median2 = numbers.length / 2 - 1;
		answer = numbers[median] + numbers[median2];
		return answer;
	}
}