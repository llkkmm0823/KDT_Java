package 상속;

public class 증가스레드 extends Thread {

	@Override
	public void run() {
		//동시에 실행하고 싶은 내용을 코딩해주세요. 
		//구현해주세요.
		for (int i = 1; i <= 1000; i++) {
			System.out.println("증가 >> " + i);
		}
	}
}

