package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스마일앨범 {

	public static int start = 2;
	
	public static void main(String[] args) {
		String[] title = {"아빠스마일","엄마스마일","친구스마일","형스마일","나스마일"};
		String[] img =  {"1.png","2.png","3.png","4.png","5.png"};
		double[] jumsu = {11.1, 22.2, 33.3, 44.4, 55.5};
	//	System.out.println(title[0] + " " + img[0] + " " + jumsu[0]);
	//	System.out.println(title[1] + " " + img[1] + " " + jumsu[1]);
		JFrame f = new JFrame("나의 스마일앨범");
		f.setSize(500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.green);
	//라벨 3개 
		JLabel top = new JLabel(title[2]);
		
		ImageIcon icon = new ImageIcon(img[2]);
		JLabel center = new JLabel();
		center.setIcon(icon);
		
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		//JLabel under = new JLabel(jumsu[2] + "");
		
	//버튼 2개
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
		
	//폰트 
		Font font = new Font("궁서", Font.BOLD, 40);
		top.setFont(font);
		under.setFont(font);
		left.setFont(font);
		right.setFont(font);
		
		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(center, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(under, BorderLayout.SOUTH);
		
		//색 지정
		left.setBackground(Color.yellow);
		left.setForeground(Color.blue);
		left.setOpaque(true); // 불투명 true
		left.setBorderPainted(false);
		right.setBackground(Color.yellow);
		right.setForeground(Color.blue);
		right.setOpaque(true); // 불투명 true
		right.setBorderPainted(false);
		top.setForeground(Color.red);
		under.setForeground(Color.red);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start > 0) {
					start--; 
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else { //0일때!!
					JOptionPane.showMessageDialog(f, "여기가 끝입니다.");
				}
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start < 4) {
					start++; //3
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else { //start >= 4
					JOptionPane.showMessageDialog(f, "여기가 끝입니다.");
				}
			}
		});
		
		
		//맨 아래에!
		f.setVisible(true);
	}

}
