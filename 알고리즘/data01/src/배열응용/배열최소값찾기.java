package 배열응용;

import 배열기본.Print;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		int[] n = { 90, 80, 20, 60, 70 };
		//최소값/최대값을 찾을 때는
		//인덱스를 하나씩 옮기면서 
		//거기까지의 최소값/최대값을 넣어둘 수 있는
		//변수를 따로 만들어주세요..
		//그 최소값/최대값보다 작거나 크면 
		//최소값/최대값 넣어주는 변수가 변경됨.
		int min = n[0]; //첫번째값을 넣어주세요.
		for (int x : n) {
			if(x < min) { //80 < 90
				min = x; //min = 80
			}
		}
		System.out.println(min);
		Print.arr(n);
	}
}
