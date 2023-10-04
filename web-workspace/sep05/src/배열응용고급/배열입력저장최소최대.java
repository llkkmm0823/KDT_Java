package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장최소최대 {

	public static void main(String[] args) {
		//A. 입력 
		int[] arr = new int[10];
		//{0,0,0,0,0,0,0,0,0,0}, 자동초기화 
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) { //0~9, 10번 반복 
			System.out.print("숫자입력>> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		//B. 처리 
		Arrays.sort(arr); //파괴형 함수 
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
		int max = arr[arr.length - 1];
		
		//C. 출력 
		System.out.println("최댓값: " + max);
		System.out.println("최소값: " + min);

	}

}
