package 제어문복습;

import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디와 패스워드를 순서대로 입력해주세요.");
		String id = sc.next();//String,admin
		String pw = sc.next();//String,1111
		
		String result = ""; //대입연산자 
		if (id.equals("root") && pw.equals("1234")) { //논리연산자, and연산자 
		//if(조건 && 조건 ) ==> 조건 중에서 모두 true이여야 if문은 true
		//       and연산자  ==> false일 가능성이 높은 것을 맨 앞을 두어라.!
		//if(조건 || 조건) ==> 조건 중에서 하나라도 true이면 If문은 true
		//       or연산자  ==> true일 가능성이 높은 것을 맨 앞에 두어라.! 
			//if문에 들어가는 조건은 비교하는 기능이 들어가야함.
			//조건의 결과는 논리형데이터(true/false) 
			result = "로그인 성공";
		}else { //false
			result = "로그인 실패";
		}
		
		System.out.println(result);
	}

}
