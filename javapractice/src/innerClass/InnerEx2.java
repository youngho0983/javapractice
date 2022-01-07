package innerClass;

public class InnerEx2 {

	class InstanceInner {}
	static class StaticInnser {}
	
	//인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 접근이 가능하다.
	StaticInnser cv = new StaticInnser();
	
	static void staticMethod() {
		// static멤버는 인스턴스 멤버에 접근 불가
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
