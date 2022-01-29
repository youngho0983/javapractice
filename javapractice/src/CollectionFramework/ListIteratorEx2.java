package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorEx2 {

	public static void main(String[] args ) {
		ArrayList original = new ArrayList();
		ArrayList copy1 = new ArrayList();
		ArrayList copy2 = new ArrayList();
		
		for(int i=0; i < 10; i++ ) {
			original.add(Integer.toString(i));
		}
		
		Iterator it = original.iterator();
	
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		System.out.println(original);
		System.out.println(copy1);
		
		Iterator it2 = original.iterator();
		
		while(it2.hasNext()) {
			copy2.add(it2.next());
			it2.remove();
		}
		
		System.out.println(original);
		System.out.println(copy2);
	}
}
