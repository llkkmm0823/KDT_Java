package 문자열관련;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); //주소비교 
		System.out.println(s.equals(s2)); 
		//주소가 가르키는 값이 동일하냐?? 비교 
		s2 ="hahahaha";
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		//가르키는 값이 동일하면 같은 주소를 가르키게 
		//만들어져있음.
		//String의 값을 변경하면 주소도 함께 변경 
		//String의 값이 자주 변경이 일어나는 경우 
		//String을 쓰면 비효율적이다.!
		StringBuilder sb = new StringBuilder("pongpong");
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb == sb2);
		sb.append("hahaha");
		System.out.println(sb);
		//sb를 String으로 변경하는 방법 
		String result = sb.toString();
		System.out.println(result);
		sb.replace(0, 3, "ttt");
		System.out.println(sb);
		sb.delete(0, 3); //0~2
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse(); //기존 스트링을 역으로 변경할 때 
		System.out.println(sb);
		
	}

}
