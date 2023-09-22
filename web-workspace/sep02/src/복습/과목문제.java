package 복습;

public class 과목문제 {

	public static void main(String[] args) {
		int k = 75;
		int m = 50;
		
		int sum = k + m;
		//double avg = sum / 2;
		//double avg = sum / 2.0;
		double avg = (double)sum / 2;
		// 125 / 2 ==> 62;
		// avg = 62.0
		// double <-- int <-- short <-- byte
		// 계산결과가 실수로 해야하는 경우는 계산할 때부터
		// 실수를 사용해야 한다.
		// 하나라도 실수이면 계산 결과는 실수이다.
		
		System.out.println(avg + " " + sum);

	}

}