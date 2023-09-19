package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기2 {

	public static void main(String[] args) {
		// 1. 필요한 부품에 ram에 다 준비합시다.
//		JFrame f
//		JButton b
//		JTextField t1
//		JTextField t2
//		JTextField t3
//		FlowLayout flow
		
		//다 import 해주는 단축키 - 컨트롤 + 쉬프트 +o(오)
		JFrame f = new JFrame();
		f.setSize(250, 300);
		
		JButton b = new JButton();
		b.setText("@@@@@@@@@@ 나를 눌러요 @@@@@@@@@");
		
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		//글자써주는 부품 JLabel
		JLabel l1 =  new JLabel();
		l1.setText("이름");
		JLabel l2 =  new JLabel();
		l2.setText("나이");
		JLabel l3 =  new JLabel();
		l3.setText("취미");
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b);
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(l3);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton);
		//맨 끝에 넣어야 해요.!!
		//위에서 작업한 것 다 보여집니다.!!
		f.setVisible(true);

	}

}
