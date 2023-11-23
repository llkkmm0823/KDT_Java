package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution01 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		//꺼낼 때는 앞 0부터 꺼내줄 예정 => i
		//넣을 때는 뒤(개수-1)부터 넣어줄 예정 => j
		int j = answer.length - 1;
		//{1,2,3} ==>  length(3) - 1 ==> 2
		for (int i = 0; i < answer.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
		return answer;
	}
}