package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;//오전 
		int count2 = 4;//오후 
		int total = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + total + "명입니다. ");
	}

}
