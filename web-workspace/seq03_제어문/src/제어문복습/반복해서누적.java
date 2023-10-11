package 제어문복습;

public class 반복해서누적 {

	public static void main(String[] args) {
		// 1-10까지 다 더해보자.
		int sum = 0; //누적시키는 변수는 반복문밖에서 만들어주어야 한다. 
		for (int i = 1; i <= 10000; i++) {
			// 초기값, 조건식, 증감식 ==> 유한반복 <--> 무한반복 while(true)
			// 조건식은 비교하는 연산이 나와야하고, 반드시 결과가 논리형(true)
			sum = sum + i;
		}

		System.out.println(sum);
	}

}
