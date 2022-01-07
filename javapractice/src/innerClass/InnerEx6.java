package innerClass;

public class InnerEx6 {

	Object iv = new Object() { void method() {}} ;
	static Object cv = new Object() { 
		void method() {} 
		void hello() {
			System.out.println("hello");
		}
	};
	
	void myMethod() {
		Object lv = new Object() { void method() {} };
	}
	

}
