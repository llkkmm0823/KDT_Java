package 제어문.조건문;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고 싶은 입력>> ");
		String  name = sc.next();
		
		switch (name) {
		case "짜장면":
			System.out.println("중국집으로 go!");
			//break를 포함하고 있는 {}를 찾으세요.!
			break;//벗어나겠다.
		case "라면":
			System.out.println("분식집으로 go!");
			break;
		case "회":
			System.out.println("횟집으로 go!");
			break;
		default:
			System.out.println("안먹음.");
		}
		
		
	}

}
