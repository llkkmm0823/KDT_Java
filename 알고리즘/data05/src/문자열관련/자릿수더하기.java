package 문자열관련;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int num = 1234;
		int result = s.solution(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		String s = String.valueOf(n);//"1234"
		//String의 값들을 하나씩 떨어뜨리는 방법은 2가지 
		int answer = 0;
		
		//1) char로 분리 ==> 아스키코드를 고려!!
		char[] c = s.toCharArray(); 
		//c = {'1','2','3','4'};
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0';
		}
		//2) String로 분리(** 더편함)
		//String[] s2 = s.split(""); 
		//s2 = {"1","2","3","4"};
		//하나씩 꺼내서 int로 변경 후, 더해주자.
//		for (int i = 0; i < s2.length; i++) {
//			int x = Integer.parseInt(s2[i]);
//			answer = answer + x;
//		}
		return answer;
	}
}