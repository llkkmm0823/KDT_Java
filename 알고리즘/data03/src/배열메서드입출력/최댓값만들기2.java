package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		//1, 2, -3, 4, -5
		//값의 목록 중 음수(-)를 포함하고 있는 경우 
		//두 수를 곱했을 때 최댓값 찾기 
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //파괴형, 오름차순!!
		//Print.arr(numbers);
		int last = numbers[numbers.length - 1]; //4
		int last2 = numbers[numbers.length - 2]; //3
		int post = last * last2;
		
		int first = numbers[0];
		int first2 = numbers[1];
		int pre = first * first2;
		
		//System.out.println(pre + " " + post);
		int answer = 0;
		//pre와 post중에서 더 큰 것을 answer로 지정!
		if (pre >= post) {
			answer = pre;
		} else {
			answer = post;
		}
		return answer;
	}
}