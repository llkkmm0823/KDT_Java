package 정렬;

import java.util.ArrayList;
import java.util.Arrays;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		Solution0 s = new Solution0();
		String s2 = "1 2 4 3";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution0 {
	public String solution(String s2) {// 1 2 3 4
		// Integer.parseInt("");
		String[] s3 = s2.split(" ");// {"1","2","3","4"}
		int[] n = new int[s3.length];//{0,0,0,0}
		for (int i = 0; i < n.length; i++) {
			n[i] =  Integer.parseInt(s3[i]);
		}
		//System.out.println(Arrays.toString(n));
		Arrays.sort(n);
		//System.out.println(Arrays.toString(n));
		String answer = n[0] + " " + n[n.length - 1];// 1 4
		return answer;				
	}
}