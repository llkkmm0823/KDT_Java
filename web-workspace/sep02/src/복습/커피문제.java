package 복습;

public class 커피문제 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		int count = 5;
		int price = 5000;

		int sum = count * price;

		String result = "";
		if (sum > 20000) {
			result = "할인해드릴게요.";
		} else {
			result = "총 커피값을 내세요.";
		}

		System.out.println(result);
	}

}
