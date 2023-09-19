package 제어문.조건문;

public class 문자열비교 {

	public static void main(String[] args) {
		String pass = "password"; 
		//db관리자가 사용하는 비밀번호????
		//기본형만 == 연산자를통해 값을 비교 가능!
		
		if (pass.equals("password")) {
			System.out.println("들어오세요");
		} else {
			System.out.println("들어올수없어요.");

		}

	}

}
