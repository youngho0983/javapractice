package UsefullClass;
import static java.lang.Math.*;
public class MathEx2 {

	public static void main(String args[]) {
		int x1 = 1 , x2 = 2; 
		int y1 = 1 , y2 = 2;
		
		double c = Math.sqrt(Math.pow(x2-x1 ,  2) + (Math.pow(y2 - y1 , 2)));
		System.out.println (c);
		double a = c * Math.sin(PI / 4);
		double b = c * cos(PI / 4);
		//docuble b = c * cos(toRadians(45));
		

		System.out.printf("a = %f%n", a);
		System.out.printf("b = %f%n", b);
		System.out.printf("c = %f%n", c);
		System.out.printf("angle=%f rad%n", atan2(a,b));
		System.out.printf("angle=%f degree%n", atan2(a,b)* 180 / PI);
		// System.out.printf("angle= %f degree %n %n", toDegrees(atan2(a,b,));
	
		/*
		 * abs => ���밪
		 * ceil => �ø�
		 * floor => ����
		 * round => �ݿø�
		 * 
		 * max �ΰ��� �ִ밪
		 * min �ΰ��� �ּ� ��
		 * random 0 <= d < 1;
		 * rint �־��� ������ ����� �������� double ������ ��ȯ
		 * 
	
		 */			
	
	
	}
}
