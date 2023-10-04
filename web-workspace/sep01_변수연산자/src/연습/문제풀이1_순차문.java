package 연습;

import javax.swing.JOptionPane;

public class 문제풀이1_순차문 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일");
		String doing = JOptionPane.showInputDialog("수업 후 무엇을 하실 예정");
		
		String result = "오늘 " + today + "에 나는 " + doing + "할 예정";
		
		System.out.println(result);
		

	}

}
