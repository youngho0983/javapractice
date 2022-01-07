package innerClass;

class Outer2 {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
		}
	}
}

public class InnerEx5 {
	
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		Outer2.Inner in = ot.new Inner();
		in.method1();
	}

}
