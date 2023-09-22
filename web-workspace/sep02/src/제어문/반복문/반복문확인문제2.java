package 제어문.반복문;

public class 반복문확인문제2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//0~9
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			//0~4
			System.out.print("커피*");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			//0~2
			System.out.println("커피*우유");
		}
		
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i + ":짱");
		}
		

	}

}
