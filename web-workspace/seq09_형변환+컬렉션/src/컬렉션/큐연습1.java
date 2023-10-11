package 컬렉션;

import java.util.LinkedList;

public class 큐연습1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		System.out.println(list);
		for (int i = 0; i < 3; i++) {
			list.remove();
			System.out.println(list);
		}

	}

}
