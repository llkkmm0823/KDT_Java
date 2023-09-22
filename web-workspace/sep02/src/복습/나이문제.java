package 복습;

public class 나이문제 {

	public static void main(String[] args) {
		int age = 100;
		
		int age2 = age + 1;
		
//		String result = "";
//		if (age2 > 100) {
//			result = "이제부터 시작.";
//		} else {
//			result = "아직 젊어요.";
//		}
		
		String result = "아직 젊어요.";
		//if문이 else일때를 초기값을 넣어두자!
		if (age2 > 100) { //true일 때, result의 값을 변경!
			result = "이제부터 시작.";
		} 
		
		System.out.println(result);

	}

}