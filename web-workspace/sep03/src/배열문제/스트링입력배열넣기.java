package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링입력배열넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[3]; //{null, null, null}
		System.out.println(Arrays.toString(arr));
		//int x = null; ?????
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("문자열을입력>>");
			arr[i] = sc.next();
			//System.out.println(data);
		}
		System.out.println(arr[0] + "보다는 " + arr[1]);

	}

}
