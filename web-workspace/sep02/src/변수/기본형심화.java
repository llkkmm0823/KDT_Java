package 변수;

public class 기본형심화 {

	public static void main(String[] args) {
		//기본형 데이터 4가지 ==> 값을 변수에 바로 넣는다. 원시타입
		//정수, 실수, 문자1, 논리
		//정수 4가지(byte, short, int, long)
		//실수 2가지(float, double)
		byte age = 127; //+-127(-128~127), 1byte(8비트)
		//byte age2= 128;
		short wallet = 25000; //+-3만, 2byte
		int money = 200000000; //+-21억, 4byte
		long space = 20000000000L; //21억이상, 8byte
		
		float weight = 88.8f;
		double height = 185.50000000000;
		//모두 int로 했을 때와 메모리 크기 비교!
		//1) 각각 타입을 다르게 해서 메모리 할당 ==> 7byte 
		//2) 모두 같은 타입인 int로 메모리 할당 ==> 12byte
		//은행 고객이 5명 로그인을 한 경우
		//1) 7 * 5 = 35byte
		//2) 12 * 5 = 60byte
		
		
		//0 ==> 0/1 ==> 0, 1
		//00 ==> 00/01/10/11 ==> 0

	}

}