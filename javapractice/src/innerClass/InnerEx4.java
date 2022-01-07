package innerClass;

class Outer {

	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
	
}


public class InnerEx4 {
	public static void main(String[] args) {
		
		Outer ot = new Outer();
		Outer.InstanceInner li = ot.new InstanceInner();
		
		System.out.println(li.iv);
		System.out.println(Outer.StaticInner.cv);
		// ����ƽ ���� Ŭ������ �ܺο��� ���� ���ص� ��� ����
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv);
	}
}
