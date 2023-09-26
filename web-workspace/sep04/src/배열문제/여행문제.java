package 배열문제;

public class 여행문제 {

	public static void main(String[] args) {
		String[] last = {"제주도", "양양", "속초"};
		String[] year = {"제주도", "부산", "울산"};
		//힌트!
		System.out.println(last[0].equals(year[0]));
		//비교하는데, String비교 ==(X), equals()(O)
		//1.작년과 올해에도 가고 싶은 장소가 동일한 것은 몇 개인가?
		int same = 0; int diff = 0;
		for (int i = 0; i < year.length; i++) {
			if(last[i].equals(year[i])){
				same++;
				System.out.println(last[i]);
			}else {
				diff++;
			} //else
		}//for
		System.out.println(same + " " + diff);
		
		//2.작년과 올해에 가고 싶은 장소가 달라진 것은 몇 개인가?(우선순위가 바뀌거나 없는 것)
		
		//1-2)작년과 올해에도 가고 싶은 장소가 동일한 곳은 "어디인가?"
	}

}
