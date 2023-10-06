package 상속;

public class 감소스레드 extends Thread {

	@Override
	public void run() {
		//동시에 실행하고 싶은 내용을 코딩해주세요. 
		//구현해주세요.
		for (int i = 1000; i >= 1; i--) {
			System.out.println("감소 >> " + i);
		}
	}
}

