package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식점주문화면 {
    static int 짬뽕개수 = 0;
    static int 짜장개수 = 0;
    static int 우동개수 = 0;
    static int total = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(700, 600);

        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);

        JButton b1 = new JButton();
        b1.setText("짬뽕");
        JButton b2 = new JButton();
        b2.setText("우동");
        JButton b3 = new JButton();
        b3.setText("짜장");

        JLabel l1 = new JLabel();
        l1.setText("짬뽕 개수: 0개");

        JLabel l2 = new JLabel();
        ImageIcon icon = new ImageIcon("main.png");
        l2.setIcon(icon);

        JLabel l3 = new JLabel();
        l3.setText("짬뽕: 0개, 우동: 0개, 짜장: 0개");

        JLabel l4 = new JLabel();
        l4.setText("결제금액");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        Font font = new Font("맑은 굴림", 1, 30);

        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        l1.setForeground(Color.blue);
        l2.setForeground(Color.blue);
        l3.setForeground(Color.blue);
        l4.setForeground(Color.blue);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("짬뽕 선택함.");
                짬뽕개수++;
                total++;
                l1.setText("짬뽕 개수: " + 짬뽕개수 + "개");
                l3.setText("짬뽕: " + 짬뽕개수 + "개, 우동: " + 우동개수 + "개, 짜장: " + 짜장개수 + "개");
                l4.setText("결제금액 : " + total * 5000 + "원");
                ImageIcon 짬뽕이미지 = new ImageIcon("zzam.png");
                l2.setIcon(짬뽕이미지);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("우동 선택함.");
                우동개수++;
                total++;
                l1.setText("우동 개수: " + 우동개수 + "개");
                l3.setText("짬뽕: " + 짬뽕개수 + "개, 우동: " + 우동개수 + "개, 짜장: " + 짜장개수 + "개");
                l4.setText("결제금액 : " + total * 4000 + "원");
                ImageIcon 우동이미지 = new ImageIcon("udong.PNG");
                l2.setIcon(우동이미지);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("짜장 선택함.");
                짜장개수++;
                total++;
                l1.setText("짜장 개수: " + 짜장개수 + "개");
                l3.setText("짬뽕: " + 짬뽕개수 + "개, 우동: " + 우동개수 + "개, 짜장: " + 짜장개수 + "개");
                l4.setText("결제금액 : " + total * 6000 + "원");
                ImageIcon 짜장이미지 = new ImageIcon("zzazang.PNG");
                l2.setIcon(짜장이미지);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
