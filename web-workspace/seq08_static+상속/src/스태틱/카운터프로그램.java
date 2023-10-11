package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	public static int count; //전역변수 0으로 초기화 
	
	public static void main(String[] args) {
		//static int n1 = 0;
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400, 300);
		
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());
		
		JButton plus = new JButton("1더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1빼기");
		JLabel number = new JLabel("0");
		number.setForeground(Color.red);
		
		Font font = new Font("궁서", Font.BOLD, 15);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		
		number.setFont(new Font("궁서", Font.BOLD, 150));
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");//String.valueOf();
				
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");//String.valueOf();
				
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");//String.valueOf();
				
			}
		});
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
//		public class JFrame{
//			public String title;
//			public static final int EXIT_ON_CLOSE = 3; 
		     //상수(final), 변수명을 모두 대문자로 사용함. 
//			
//			public JFrame(String title) {
//				this.title = title;
//			}
//		}

	}

}
