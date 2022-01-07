package innerClass;

public class InnerEx3 {

	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;  //같은 클래스 내부가 private 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv =  outerIv;
		static int scv =  outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;   // 1.8 전 버전에선 에러 처리됨
			int liv4 = LV;
		}
	}
	
}
