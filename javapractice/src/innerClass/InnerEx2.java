package innerClass;

public class InnerEx2 {

	class InstanceInner {}
	static class StaticInnser {}
	
	//�ν��Ͻ���� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	// static ��� ������ ���� ������ �����ϴ�.
	StaticInnser cv = new StaticInnser();
	
	static void staticMethod() {
		// static����� �ν��Ͻ� ����� ���� �Ұ�
//		InstanceInner obj1 = new InstanceInner();
		StaticInnser obj2 = new StaticInnser();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInnser obj2 = new StaticInnser();
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner li = new LocalInner();
	}
	
	public static void main(String[] args) {
		
	}
}
