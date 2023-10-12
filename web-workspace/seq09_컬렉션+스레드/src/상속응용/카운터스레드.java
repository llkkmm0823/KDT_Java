package 상속응용;

public class 카운터스레드 extends Thread{
//run(), start(), .....
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용!
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터>> " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러출력 
				//이메일을 보내는 처리 
				//문자로 보내는 처리
			}
			//외부의 자원 cpu을 연결할때는 
			//아주 위험한 순간이기 때문에 
			//위험한 순간이 발생했을 때
			//어떻게 처리할지를 명시해야주어야함.
		}
	}
}
