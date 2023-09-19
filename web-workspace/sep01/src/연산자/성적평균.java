package 연산자;

import javax.swing.JOptionPane;

public class 성적평균 {

	public static void main(String[] args) {
		int p = 66;
		int m = 77;
		int e = 88;
		int k = 99;
		
		int sum = p + m + e + k;
		
		double avg = sum / 4.0;
		
		System.out.println(avg);
		
		final double PI = 3.14; //상수 (final), 변경불가
		
		//PI = 5.14;
		double r = 2.2;
		double result = PI * r * r;
		System.out.println("원의 면적 >> " + result);
		System.out.printf("원의 면적 >> %.2f", result);
		String result2 = String.format("원의 면적 >> %.2f", result);
		JOptionPane.showMessageDialog(null, result2);
		

	}

}
