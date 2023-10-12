package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("미국");
		tour.add("하와이");
		tour.add("싱가폴");
		tour.add("부산");
		tour.add("부산");
		System.out.println(tour);

		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.put("거실", "책상");
		System.out.println(map);

		ArrayList list = new ArrayList();
		list.add("코딩수업듣기");
		list.add("이러닝수업듣기"); //1
		list.add("코딩연습");
		list.add("쉬기");
		list.add("잠자기");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		list.set(1, "청소");
		System.out.println(list);
	}

}
