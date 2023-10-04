package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(1200, 930); //void 
		
		//라벨3개, 텍스트필드2개, 버튼2개
		JLabel top = new JLabel();
		//top.setText("<<<이미지 들어가는 곳>>>> "); //void 
		JLabel id1 = new JLabel();
		id1.setText("ID: ");
		JLabel pw1 = new JLabel();
		pw1.setText("PW: ");
		
		JTextField	id2 = new JTextField(10);
		JTextField	pw2 = new JTextField(10);
		
		JButton	login = new JButton();
		login.setText("로그인");
		JButton	reset = new JButton();
		reset.setText("지우기");
		login.setBackground(Color.yellow);
		login.setForeground(Color.red);
		login.setOpaque(true); //불투명 true
		login.setBorderPainted(false);
		reset.setBackground(Color.yellow);
		reset.setForeground(Color.red);
		reset.setOpaque(true); //불투명 true
		reset.setBorderPainted(false);
		
		//레이아웃 flowlayout
		//폰트 	
		Font font = new Font("맑은 고딕", 1, 50);
		top.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		id2.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //void 
		//이미지 끼기
		ImageIcon icon1 = new ImageIcon("diary4.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);
		f.add(top); //void 
		f.add(id1); //라벨 
		f.add(id2); //텍스트필드 
		f.add(pw1);  //라벨 
		f.add(pw2); //텍스트필드 
		f.add(login); //버튼 
		f.add(reset); //버튼 
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//위에서 설정한 것을 다 보여라.!
		f.setVisible(true); //void 
	}
}
