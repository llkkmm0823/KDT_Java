package 배열문제;

import java.util.Arrays;

public class 다양한타입배열 {

	public static void main(String[] args) {
		String[] tour = {"부산","홍천","대전","천안","광주"};
		char[] color = {'r','g','b','w','b'};
		double[] height = {155.5, 166.6, 177.7, 188.8, 199.9};
		System.out.println(Arrays.toString(tour));
		System.out.println(Arrays.toString(color));
		System.out.println(Arrays.toString(height));
		
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
		double sum = 0.0;
		for (double d : height) { //foreach문- 알아서 배열에 있는거 하나씩 꺼내줌.
			//하나씩 꺼낸 것 d라는 변수에 넣어둬라.!
			System.out.println(d); //인덱스사용 불가능 
			sum = sum + d;
		}
		System.out.println("평균은 >> " + sum / height.length);
	}

}
