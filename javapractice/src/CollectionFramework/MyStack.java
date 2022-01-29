package CollectionFramework;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {

	public Object push(Object item) { 
		addElement (item);
		
		return item;
	}
	
	public Object pop() {
		Object lastItem = peek();
		removeItem(size() - 1);
		
		return lastItem;
		
	}
	
	public Object peek() {
		int len = size();
		
		if (len == 0) {
			throw new EmptyStackException();
		}
		
		return elementAt(len - 1);
	}
	
	
	public Boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		
		if (i >= 0) {
			return size() -i;
		}
		return -1;
	}
	

}
