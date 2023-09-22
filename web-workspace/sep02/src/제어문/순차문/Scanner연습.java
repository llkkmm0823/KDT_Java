package 제어문.순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		//200번 연습
		Scanner sc = new Scanner(System.in);
		//new로 자동완성하고 빨간 밑줄이 생기면
		//부품이 어디있는지 모르겠다라는 의미 
		//빨간 밑줄 생긴 단어에서 클릭후, 첫번째 import를 선택함. 
		System.out.print("이름 입력>> ");
		String name = sc.next();//String으로 입력한 값을 가지고 들어온다.
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt(); //모든 입력은 String --> int로 변경해주는 기능 
		System.out.println("당신의 내년 나이는 " + (age + 1));
		
		System.out.print("몸무게 입력>> ");
		double w = sc.nextDouble(); //String --> double
		System.out.println("당신의 몸무게는 " + (w - 10));
	}

}
