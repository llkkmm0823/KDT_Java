package 복습;

public class 마스크문제 {

	public static void main(String[] args) {
		int waterPrice = 1000;
		int waterCount = 2;
		int maskPrice = 2000;
		int maskCount = 3;
		//변수는 상수가 아니면 소문자로 사용한다.!
		//낙타표기법
		//자동완성 컨트롤 + 스페이스바 
		int water = waterPrice * waterCount;
		int mask = maskPrice * maskCount;
		int pay = water + mask;
		
		System.out.println(water + " " + mask + " " + pay);

	}

}