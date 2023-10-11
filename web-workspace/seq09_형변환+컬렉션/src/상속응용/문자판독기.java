package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 문자판독기 extends JFrame {
	JLabel ch, words, chCount, wordsCount;
	JTextArea area; // null==> 주소없음. 저장해놓은 위치가 아직 없음.
	JButton b1, b2, b3; // null
	// 전역변수는 자동초기화, 참조형변수 ==> null!!!

	public 문자판독기() {
		setTitle("문자판독기");
		setSize(500, 500);

		ch = new JLabel("문자수>> ");
		words = new JLabel("단어수>> ");
		chCount = new JLabel("문자수 결과들어갈 자리");
		wordsCount = new JLabel("단어수 결과들어갈 자리");

		area = new JTextArea(5, 10);// 세로 5줄, 가로 10글자

		b1 = new JButton("글자수카운트");
		b2 = new JButton("배경색변경");
		b3 = new JButton("글자색변경");

		setLayout(new FlowLayout());

		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(area);
		add(b1);
		add(b2);
		add(b3);

		Font font = new Font("맑은 고딕", Font.BOLD, 35);
		ch.setFont(font);
		chCount.setFont(font);
		words.setFont(font);
		wordsCount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		area.setBackground(Color.yellow);
		area.setForeground(Color.blue);

		chCount.setForeground(Color.red);
		wordsCount.setForeground(Color.red);

		getContentPane().setBackground(Color.GREEN);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리할 내용
				// 모의코드(수도코드, pseudo code)
				// 입력한 문자열을 가지고 와서 저장해주세요.
				String s = area.getText();
				// 글자수를 카운트해주세요.
				int num = s.length();

				// 단어수를 계산해주세요.
				String[] s2 = s.split(" "); // {단어, 단어, 단어}
				int num2 = s2.length;
				
				// 각각의 라벨에 넣어주세요.
				chCount.setText(num + ""); // String.valueOf(num);
				wordsCount.setText(num2 + ""); // String.valueOf(num2);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		문자판독기 name = new 문자판독기();
	}

}
