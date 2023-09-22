package 제어문.반복문;

import java.util.Random;

public class 랜덤Test {

	public static void main(String[] args) {
			Random r = new Random();
			//int target = r.nextInt(); //+-21억 
			//int target = r.nextInt(10); //0부터 지정한 값보다 하나 적게설정 가능! 
			//int target = r.nextInt(100); //0부터 지정한 값보다 하나 적게설정 가능! 
			//0 - 99
			//1 - 100 ==> 최소값만큼 최대값을 빼주서야함.
			int target = r.nextInt(99) + 1; //1부터 지정한 값보다 하나 적게설정 가능! 
			System.out.println(target);
	}

}
