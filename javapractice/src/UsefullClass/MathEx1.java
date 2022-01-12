package UsefullClass;

public class MathEx1 {

	public static void main(String args[]) {
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i );
		System.out.println("-i = " + (-i));
		
		/* 
		 *  int addExact(int x , int y )  x + y
		 *  int subtractExact(int x , int y) x - y
		 *  int multipleExact ( int x  , int y) x *y
		 *  incrementExact(int a ) a++
		 *  decrementExact ( int a ) a--
		 *  negateExact ( int a )  -a
		 *  toIntExact (long value) ==> int value
		 * */
		
		
		try {
			System.out.printf("negateEact(%d) = %d%n", 10 , Math.negateExact(10));
			System.out.printf("negateExact(%d) = %d %n", -10, Math.negateExact(-10));
			System.out.printf("negateExact(%d) = %d %n", i, Math.negateExact(i));
		} catch(ArithmeticException e) {
			System.out.printf ( "negateExact(%d) = %d %n ", (long)i, Math.negateExact((long)i));
		}
	}
}
