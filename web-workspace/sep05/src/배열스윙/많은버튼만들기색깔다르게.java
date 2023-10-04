package 배열스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 많은버튼만들기색깔다르게 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1500, 1000);

		f.setLayout(null);

//		Container c = f.getContentPane(); //Container
//		c.setBackground(Color.green);

		f.getContentPane().setBackground(Color.green);
		// 체인식 코드(편하기 때문에 사용 가능)

		JButton[] buttons = new JButton[500];
		// {null, null, null, null, null, ......}
		// buttons[0], buttons[1]

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}

		Random r = new Random();
		Color[] colors = {Color.red, Color.yellow, Color.pink};
		//colors[0], colors[1], colors[2]
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1500); 
			int y = r.nextInt(1000);
			int index = r.nextInt(3); //0,1,2
			buttons[i].setBounds(x, y, 100, 50); //위치 설정 
			buttons[i].setBackground(colors[index]);
			buttons[i].setOpaque(true); //불투명 true
			buttons[i].setBorderPainted(false);
			f.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 버튼클릭했을 때 처리하고 싶은 내용 쭉 써주면 됩니다.!
					String s = e.getActionCommand();//버튼위에 글자를 가지고 와줘요.! 
					JOptionPane.showMessageDialog(f, s + "번을 클릭하셨군요.!");
				}
			});
			
		}
		// 맨 마지막으로!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
