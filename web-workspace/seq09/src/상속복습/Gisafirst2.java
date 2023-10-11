package 상속복습;

public class Gisafirst2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.paint();
		b.draw();
	}
}
class A2 {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}
class B2 extends A2 {
	@Override
	public void paint() {
		super.draw();
		System.out.print("C");
		this.draw();
	}
//	똑같이 써버리면 덮어 써버림_Override를 써줘도 안써줘도 무방하지만 쓰면 더 명확히 확인가능
	public void draw() {
		System.out.print("D");
	}
}