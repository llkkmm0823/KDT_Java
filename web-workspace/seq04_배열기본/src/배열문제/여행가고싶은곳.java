package 배열문제;

import java.util.Scanner;

public class 여행가고싶은곳 {
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] n = new String[3];
		String[] m = new String[3];
		int cnt = 0;
		int cnt1 = 0;
		for (int i = 0; i < 3; i++) {

			n[i] = sc.next();
			m[i] = sc.next();

			if (n[i].equals(m[i])) {
				cnt++;
			}
			else {
				cnt1++;
			}
		}

		System.out.println(cnt);
		System.out.println(cnt1);

	}

}