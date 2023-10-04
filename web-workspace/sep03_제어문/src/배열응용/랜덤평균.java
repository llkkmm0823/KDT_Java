package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		//랜덤하게 아무거나 만들어서 자동으로 배열에 여러개 넣어보자.
		Random r = new Random();
		int[] n2 = new int[50000];
		
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(100); //0~99
			//System.out.println(n);
		}
		System.out.println(Arrays.toString(n2));
		
		//for문 이용해서 더해서 평균구해보세요.!
		int sum = 0;
		for (int x : n2) {
			sum = sum + x;
		}
		System.out.println(sum + " "+ (double)sum / n2.length);
	}

}
