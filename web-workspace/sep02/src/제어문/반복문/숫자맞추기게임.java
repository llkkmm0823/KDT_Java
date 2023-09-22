package 제어문.반복문;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		int target = 88;

		while(true) {
			String data = JOptionPane.showInputDialog("숫자를 입력");
			//데이터 타입이 동일해야 비교 가능하다
			int data2 = Integer.parseInt(data);
			if(data2==target) {
				System.out.println("정답입니다");			
				System.out.println("게임을 종료합니다");
				System.exit(0);
			}else {
				System.out.println("정답이 아닙니다");
				//정답보다 높은지 낮은지 힌트
				if(target<data2) {
					System.out.println("더 낮은 수입니다");
				}else{
					System.out.println("더 높은 수입니다");	
				}
			}
		}
	}

}
