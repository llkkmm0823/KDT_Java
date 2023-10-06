package 스태틱;

public class Day {
	//전역변수 ==> 자동초기화 
	public String doing; //null
	public int time;  //0
	public String location; //null
	public static int count; //0
	public static int sum; //0
	//객체생성시 초기값을 자동으로 넣어주고 싶을 때 
	//생성자 메서드 
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}

	//객체생성후, 값들 출력하고 싶을 때 
	//toString()
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}