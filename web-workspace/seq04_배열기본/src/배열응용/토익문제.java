package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int[] 답안 = new int[990];
		int[] 내답 = new int[990];

		Random r = new Random(18);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4);//0~3
			내답[i] = r.nextInt(4);//0~3
		}
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답));
		
		//하나맞을 때 점수가 1점 
		//저는 몇 점 일까요???
		int jumsu = 0;
		for (int i = 0; i < 내답.length; i++) {
			if(답안[i] == 내답[i]) {
				jumsu++;
			}
		}
		System.out.println(jumsu);
		
	}
}
