package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 33; i <= 222; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
