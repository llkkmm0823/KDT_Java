package 자바응용;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame(); // 100
		f.setSize(500, 700);
		// f.setBackground(Color.green);
//		Container pane = f.getContentPane();
//		pane.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green);

		// 물흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton plus = new JButton(); // 200
		plus.setText("더하기");
		JButton minus = new JButton(); // 200
		minus.setText("빼 기");
		plus.setBackground(Color.yellow); // 배경색
		plus.setForeground(Color.blue); // 글자색
		minus.setBackground(Color.yellow); // 배경색
		minus.setForeground(Color.blue); // 글자색

		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.blue); // 글자색

		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 배경색
		t1.setForeground(Color.white); // 글자색

		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.blue); // 글자색

		// html에서 Input역할!
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red); // 배경색
		t2.setForeground(Color.white); // 글자색

		// 글자넣는 부품 JLabel
		JLabel top = new JLabel();
		//이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("cal.png");
		top.setIcon(icon);
		
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);

		// Font - 글자스타일 담당(글자체, 진하게여부, 글자크기)
		Font font = new Font("궁서", 1, 50);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);

		// 위에서 다 설정한 거 보여줘.! 맨 끝줄에 넣어주세요.!
		f.setVisible(true);
	}

}
