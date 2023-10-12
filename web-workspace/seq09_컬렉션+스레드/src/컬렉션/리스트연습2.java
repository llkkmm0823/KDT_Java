package 컬렉션;

import java.util.ArrayList;

public class 리스트연습2 {

	public static void main(String[] args) {
		//순서 --> list유형 --> ArrayList
		ArrayList list = new ArrayList();
		//import java.lang.*; ==> String, System, Integer
		//import java.util.*; ==> ArrayList, HashSet, Random, Date 
		list.add("박소정"); //0
		list.add("김정민"); //1
		list.add("소지현");
		list.add("김개념");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등>> " + list.get(i));
		}
		//김정민이 포함되어있나요??
		System.out.println(list.contains("김정민"));
		//박소정이 몇등인가요?
		System.out.println(list.indexOf("박소정") + 1 + "등");
		//소지현씨가 개명을 함. 소혜련!
		list.set(1, "소혜련");
		System.out.println(list);
	}

}
