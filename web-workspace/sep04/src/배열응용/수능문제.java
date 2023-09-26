package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		// 10000명의 수능점수를 저장할 공간 ==> 배열필요 int[] jumsu
		// 랜덤하게 데이터 만들어주는 부품 ==> Random

		int[] jumsu = new int[10000]; // {0,0,0,0,0,0,,~}
		Random r = new Random(42);

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0 ~ 450(451을 써주어야함.)
		}
		System.out.println(Arrays.toString(jumsu));
		System.out.println("=================");

		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}

		System.out.println("평균은 " + (double) sum / jumsu.length);

		// 최댓값, 최소값???????
		// 오름차순으로 정렬해보자.!
		// cpu가 ram의 값을 변경해버림. ==> 파괴형 함수
		Arrays.sort(jumsu); // 램에 들어있는 10000개의 데이터를 위치를 옮겨 정렬해줌.!

		// String data = "100";
		// cpu가 ram의 값을 변경하지 않는다(85%) ==> 비파괴형 함수
		// int data2 = Integer.parseInt(data);

		// Arrays.toString(jumsu) ==> 비파괴형 함수
		// Double.parseDouble(data) ==> 비파괴형 함수
		System.out.println(Arrays.toString(jumsu));
		int min = jumsu[0];
		int max = jumsu[jumsu.length - 1];
		System.out.println("최소값>> " + min);
		System.out.println("최대값>> " + max);
		// 점수가 최소값인 사람의 수, 점수가 최대값인 사람의 수 프린트
		// 배열을 순서대로 순회해서 데이터 접근
//		int minCount = 0, maxCount = 0;
		int minCount = 0;
		int maxCount = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == min) {
				minCount++;
			} else if (jumsu[i] == max) {
				maxCount++;
			}

//			if(jumsu[i] == min) {
//				minCount++;
//			}
//			if(jumsu[i] == max){
//				maxCount++;
//			} //else
		} // for
		System.out.println("최하점의 인원수 " + minCount);
		System.out.println("최고점의 인원수 " + maxCount);
		System.out.println("=======================");

		// 300점 이상인 사람의 수를 카운트
		int threeCount = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				threeCount++;
			}//if
		}//for
		System.out.println(threeCount);
	}

}
