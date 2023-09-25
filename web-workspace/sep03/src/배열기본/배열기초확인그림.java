package 배열기본;

public class 배열기초확인그림 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//arr, int[5], length ==> 7개!
		System.out.println(arr.length);
		//index ==> 0,1,2,3,4
		
		arr[0] = 100;
		arr[arr.length - 1] = 500;
		arr[2] = 200;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//입력용X, 인덱스를 사용 불가 
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		
		
	}

}
