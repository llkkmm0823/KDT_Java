package 배열문제;

import java.util.Arrays;

public class 더블배열 {

	public static void main(String[] args) {
		double[] d = new double[300];//자동초기화, 0.0
		//d, 300 double, length ==> 302개 변수 
		//double d[] 
		System.out.println(Arrays.toString(d));
		System.out.println(d.length);
		d[0] = 10.1;
		d[1] = 20.2;
		d[2] = 30.2;
		d[d.length -1] = 50.5;
		System.out.println(Arrays.toString(d));
	}

}
