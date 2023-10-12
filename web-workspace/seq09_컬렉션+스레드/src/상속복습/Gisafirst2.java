package 상속복습;

public class Gisafirst2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.paint();// BCD
		b.draw();// D
	}
}

class A2 {
	public void paint() {
		System.out.print("A");
	}

	public void draw() {
		System.out.print("B");
	}
}

class B2 extends A2 {

	@Override
	public void paint() {
		super.draw(); // B
		System.out.print("C"); // C
		this.draw(); // D
	}

	@Override
	public void draw() {
		System.out.print("D");
	}
}
