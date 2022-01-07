package innerClass;

public class InnerEx1 {
	class InstanceInner {
		int iv = 100;
		// static int cv = 100; statuc  변수 사용 못함
		final static int CONST = 100;  // final 은 상수라 가능
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;  //static 클래스에선 static 사용 가능
	}
	
	static void myMethod() {
		class LocalInner {
			int iv = 300;
			// static int cv = 300;
			static final int cv = 300;
		}
		System.out.println(LocalInner.cv);
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		myMethod();
	}

}
