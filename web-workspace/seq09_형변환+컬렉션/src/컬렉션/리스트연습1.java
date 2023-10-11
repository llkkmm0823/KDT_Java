package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습1 {

	public static void main(String[] args) {
		//순서가 있는 데이터를 모으고 싶을 때 
		//배열??? 컬렉션(리스트 형태)
		//ArrayList 
		ArrayList list = new ArrayList();
		//Collection상속 - add(),....
		list.add(100); //0
		list.add(11.1); //1
		list.add(true); //2
		list.add('a'); //3
		list.add("hong"); //4
		list.add("hong"); //5
		list.add(new Button()); //6
		//길이, 크기, 개수, size, length 
		System.out.println(list);//toString()
		//ArrayList안에 toString()이 재정의(오버라이드) 
		//list라고 주소가 가르키고 있는 데이터들을 프린트하도록 
		
		
		System.out.println(list.get(0)); //위치값은 0부터시작
		System.out.println(list.size()); //6, 0~5
		
		//hong을 꺼내서 gildong을 붙여 프린트 
		System.out.println(list.get(4) + "gildong");
		//for문으로 이용해서 하나씩 꺼내와 모든 데이터를 아래와 같이 프린트 
		//for문, for-each문 둘 다 사용 가능! 
		//"값>> " + 100
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값>> " + list.get(i));
		}
		for (Object x : list) {
			System.out.println("값>> " + x);
		}
		
		System.out.println(list.contains("hong"));
		System.out.println(list.indexOf("hong"));
		System.out.println(list.isEmpty());
		list.remove(0); //파괴형함수 
		list.remove(11.1);
		list.add(0, "추가"); //0번앞에 넣어라!
		list.set(0, "또수정");
		System.out.println(list);
	}

}
