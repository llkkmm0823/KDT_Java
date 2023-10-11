package 배열기본;

public class 아파트집찾기 {

	public static void main(String[] args) {
		int[] s = { 10, 15, 20, 10 };
		System.out.println("배열이 들어있는 주소>>" + s);
		// s안에 들어있는 주소가 가르키는 첫번째 값을 프린트
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println("전체 s가 가르키는 방의 수 >> " + s.length);
		// s.length는 읽기 전용

		int[] s2 = { 1, 2, 3 };
		//전체 변수의 개수, 메모리 크기 
		//참조형 변수는 4바이트 크기라고 가정 
		
	}

}
