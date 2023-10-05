package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;//오전 
		int count2 = 4;//오후 
		int total = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + total + "명입니다. ");
		
		int result = cal3.minus(count1, count2); //1
		System.out.println("손님 수 차이는 " + result + "명입니다.");
		
		int today1 = cal3.mul(price, count1);
		System.out.println("오전 결제금액은 " + today1 + "원입니다.");
		int today2 = cal3.mul(price, count2);
		System.out.println("오후 결제금액은 " + today2 + "원입니다.");
		
		int money = cal3.add(today1, today2);
		System.out.println("오전/오후 총 결제금액은 " + money + "원입니다.");
		
		int one = cal3.div(money, total);
		System.out.println("1인당 결제금액은 " + one + "원입니다.");
		
	}

}
