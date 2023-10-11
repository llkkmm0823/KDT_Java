package 배열문제;

import java.util.Scanner;

public class 정수입력배열넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5]; //{0,0,0,0,0}

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력>>");
			arr[i] = sc.nextInt();
			//System.out.println(data);
		}
		System.out.println(arr[0] + arr[2]);

	}

}
