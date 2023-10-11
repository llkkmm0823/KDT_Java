package 연습;

public class 테스트 {

	public static void main(String[] args) {
		String s = "a100"; //a ==> 0, 1 ==> 1
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		
		char c1 = s.charAt(0); //'a'
		char c2 = s.charAt(1); //'1'
		
		if (c1 == 'a') {
			System.out.println("기획O");
		} else {
			System.out.println("기획X");
		}
	}

}
