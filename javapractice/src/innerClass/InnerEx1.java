package innerClass;

public class InnerEx1 {
	class InstanceInner {
		int iv = 100;
		// static int cv = 100; statuc  ���� ��� ����
		final static int CONST = 100;  // final �� ����� ����
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;  //static Ŭ�������� static ��� ����
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
