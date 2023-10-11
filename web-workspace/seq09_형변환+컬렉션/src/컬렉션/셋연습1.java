package 컬렉션;

import java.util.Arrays;
import java.util.Random;

public class 셋연습1 {

	public static void main(String[] args) {
	//로또문제 
		int[] lotto = new int[6]; //넣을 공간 
		//고정길이, 같은 타입 
		
		//랜덤하게 만들어서 배열에 6개의 숫자를 넣자. 
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1; //0~44, 1~45
		}
		System.out.println(Arrays.toString(lotto));
	}

}
