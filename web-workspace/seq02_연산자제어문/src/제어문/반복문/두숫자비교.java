package 제어문.반복문;

import java.util.Scanner;

public class 두숫자비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자1 입력>> ");
			int n1 = sc.nextInt(); // String입력된 데이터 int로 변경도 해줌.
			System.out.print("숫자2 입력>> ");
			int n2 = sc.nextInt();
			if (n1 == n2) {
				System.out.println("두 수 동일함.");
			} else if (n1 > n2) {
				System.out.println("n1이 더 큼");
			} else {
				System.out.println("n2가 더 큼");
			} // else
			
			System.out.print("더 하시겠습니까?? 종료 x>> ");
			String choice = sc.next();
			//char choice2 = choice.charAt('x');
			//if (choice2 == 'x')
			String choice2 = choice.toLowerCase();//소문자로 변경 
			if (choice.equals("x") || choice.equals("X")) {
				System.out.println("종료합니다.!");
				System.exit(0);
			}
		}
	}//main

}//class
