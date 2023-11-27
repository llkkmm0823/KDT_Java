package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수연습2 {

	public static void main(String[] args) {
		int[] num = { 1, 	5, 		2, 		6, 		3, 		7, 		4};
		//           1번째 2번째 
		//            0     1
		//2번째 값 num[
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
	
		int[] answer = new int[commands.length]; //{5, 6, 3}
		
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1; //2
			int end = commands[i][1] - 1; //5
			int find = commands[i][2] -1; //3
			//1. num배열에서 2번째~5번째(인덱스 1~4)까지 추출 
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = start; j <= end ; j++) {
				list.add(num[j]);
			}
			
			//2. 정렬
			Collections.sort(list);
			System.out.println(list);
			
			//3. 원하는 위치가 3번째(인덱스 2) 숫자를 추출 
			System.out.println(list.get(find));
			answer[i] = list.get(find);
		}
		System.out.println(Arrays.toString(answer));
	}
}
