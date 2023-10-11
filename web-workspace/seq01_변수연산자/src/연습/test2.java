package 연습;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weight = JOptionPane.showInputDialog("몸무게 입력");
		String sinjang = JOptionPane.showInputDialog("신장 입력");
		
		int weight1 = Integer.parseInt(weight);
		int sinjang1 = Integer.parseInt(sinjang);
		
		double result = (double)weight1/(sinjang1*sinjang1);
		
		System.out.println(result);
	}

}
