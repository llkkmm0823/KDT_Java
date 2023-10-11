package 배열스윙;

import java.awt.Color;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);
		f.setTitle("나의 버튼들");
		f.setLayout(null);
		
		//String[] s = new String[5];
		//{null, null, null, null, null}
		
		JButton[] buttons = new JButton[200];
		//{null, null, null, null, ..}
		//모든 기본형 제외한 참조형 배열은 초기값은 null
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}
		System.out.println(Arrays.toString(buttons));
//		JButton b1 = new JButton();
//		b1.setText("버튼1");
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1500);
			int y = r.nextInt(1000);
			buttons[i].setBounds(x, y, 100, 50);
			//          가로위치, 세로위치, 가로크기, 세로크기 
			buttons[i].setBackground(Color.yellow);
			buttons[i].setForeground(Color.red);
			buttons[i].setOpaque(true); //불투명 true
			buttons[i].setBorderPainted(false);
			f.add(buttons[i]);
		}
		
		//맨끝으로 보내자.!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
