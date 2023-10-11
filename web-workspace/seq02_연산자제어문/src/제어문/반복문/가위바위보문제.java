package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보문제 {

	public static void main(String[] args) {
//		컴퓨터가 0~2까지 랜덤하게 숫자하나를 내게 한다.
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int total = 0; //누적시키는 용도인 변수는 반복문 안에 넣지 않는다.!
		int win = 0;
		
		while (true) {
			//전체 카운트하는 것 코드 넣으면 됨.
			total++;
			//0이면 가위, 1이면 바위, 2이면 보 
			int com = r.nextInt(3); //0, 1, 2
			//System.out.println("com>> " + com);
			//		내가 0~2까지 선택해서 입력하게 한다.
			System.out.print("me(0이면 가위, 1이면 바위, 2이면 보) >> ");
			int me = sc.nextInt();//String --> int
			System.out.println(com + " " + me);
			//		내가 0번을 냈을 때 컴퓨터가 낼 수 있는 경우가 0: 무승부, 1: 컴퓨터승, 2: 내가승
			//		내가 1번을 냈을 때 컴퓨터가 낼 수 있는 경우가 0: 내가승, 1: 무승부, 2: 컴퓨터승
			//		내가 2번을 냈을 때 컴퓨터가 낼 수 있는 경우가 0: 컴퓨터승, 1: 내가승, 2: 무승부
			if (me == 0) { //나는 가위를 냄 
				if (com == 0) { //컴퓨터는 가위 
					System.out.println("무승부");
				} else if (com == 1) { //컴퓨터는 바위 
					System.out.println("컴퓨터승");
				} else { //컴퓨터는 보 
					System.out.println("내가승");
					win++;
				}
			} else if (me == 1) { //나는 바위를 냄
				if (com == 0) { //컴퓨터는 가위 
					System.out.println("내가승");
					win++;
				} else if (com == 1) { //컴퓨터는 바위 
					System.out.println("무승부");
				} else { //컴퓨터는 보 
					System.out.println("컴퓨터승");
				}
			} else { //나는 보를 냄
				if (com == 0) { //컴퓨터는 가위 
					System.out.println("컴퓨터승");
				} else if (com == 1) { //컴퓨터는 바위 
					System.out.println("내가승");
					win++;
				} else { //컴퓨터는 보 
					System.out.println("무승부");
				}//else
			}//else
			System.out.print("종료하실래요X>> ");
			String exit = sc.next();
			if (exit.equals("X")) {
				System.out.println("종료합니다.");
				System.out.println("전체 " + total + "중에 내가 승리한 수는 " + win);
				System.exit(0);
			}
			//		무한루프
			//		무한루프 종료시점 명시
			//		심화문제: 전체 몇번 했는지 카운트, 내가 몇번 이겼는지 카운트
		}

	}

}
