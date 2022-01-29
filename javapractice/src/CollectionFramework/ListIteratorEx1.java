package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("1");

		list.add("2");

		list.add("3");

		list.add("4");

		list.add("5");
	
		ListIterator li = list.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println( "¿ª¼ø");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
	}
}
