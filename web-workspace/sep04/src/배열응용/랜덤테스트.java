package 배열응용;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		// Random테스트 
		Random r = new Random(100);
		//r.setSeed(100);
		
		for (int i = 0; i < 1000; i++) {
			//+-21억 ==> 0부터 시작해서 지정한 값보다 하나 작은 범위의 값(0~99)
//			int data = r.nextInt(100);
//			System.out.println(data);
			
			double data2 = r.nextDouble();
			System.out.println(data2);
		}
	}
}
