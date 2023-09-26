package 자바응용;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame(); // 100
		f.setSize(500, 750);
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
		// 이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("cal.png");
		top.setIcon(icon);

		JLabel under = new JLabel();
		under.setText("결과들어가는 곳");
		
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(under);

		// Font - 글자스타일 담당(글자체, 진하게여부, 글자크기)
		Font font = new Font("궁서", 1, 50);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		under.setFont(font);

		// 1. plus버튼 클릭했을 때 액션처리하겠다고 설정
		// 2. 어떤 부품이 할지를 램에다 만들어서 넣어주어야함.
		// 3. 그 부품안에 있는 함수(기능)을 사용해야 우리가 원하는 버튼 처리 기능을 사용할 수 있음.
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리 내용을 써주면 됨.!
				System.out.println("플러스 버튼을 눌렀군.");
				// t1, t2에 글자를 가지고 와서 ram에 저장해보자.
				String s1 = t1.getText();
				String s2 = t2.getText();
				// 데이터를 입력했는지 확인하는 방법은 2가지
				// 1. s1.equals("")
				// 2. s1.length()
				// if (s1.equals("") || s2.equals("")) {
				if (s1.length() < 1 || s2.length() < 1) {
					JOptionPane.showMessageDialog(f, "숫자입력하시오.!");
				} else {
					// 숫자로 변경해서 그 결과값을 모니터에 출력해보세요.!
					// 다이얼로그에 출력해보세요.!
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int sum = n1 + n2;

					// System.out.println("더한 값은 " + sum);
					//JOptionPane.showMessageDialog(f, "더한 값은 " + sum);
					under.setText("더한 값은 " + sum);
					// t1, t2입력한 값 지우자.!
					t1.setText(""); // t1에 공백으로 텍스트를 setting시켜라.
					t2.setText("");
				} // else

			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리 내용을 써주면 됨.!
				System.out.println("마이너스 버튼을 눌렀군.");
				String s1 = t1.getText(); // ""
				String s2 = t2.getText();

				if (s1.length() < 1 || s2.length() < 1) {
					JOptionPane.showMessageDialog(f, "숫자입력하시오.!");
				} else {

					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int result = n1 - n2;

					//JOptionPane.showMessageDialog(f, "뺀 값은 " + result);
					under.setText("뺀 값은 " + result);
					
					// t1, t2입력한 값 지우자.!
					t1.setText(""); // t1에 공백으로 텍스트를 setting시켜라.
					t2.setText("");
				}
			}
		});

		// 위에서 다 설정한 거 보여줘.! 맨 끝줄에 넣어주세요.!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x를 누르면 종료!
		// 이 설정이 없으면, 보이지만 않게 된 것임.
		f.setVisible(true);
	}

}
