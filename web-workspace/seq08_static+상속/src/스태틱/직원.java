package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count;
	public static int sumAge;

	public 직원(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sumAge = sumAge + age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	//평균을 구해주는 메서드를 만들어보자.!
	public static int getAvg() {
		//static 메서드안에서 instance를 쓰면 에러가 납니다.
		//왜일까요?? static메서드안에서는 static변수만 써야함.
		//힙영역의 변수는 언제 만들어지는가??
		//힙영역의 변수는 객체생성후에 만들어진다. 
		//System.out.println(age);
		return sumAge / count;
	}

}
