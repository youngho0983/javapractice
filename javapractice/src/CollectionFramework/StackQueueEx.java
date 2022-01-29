package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue qu = new LinkedList();

		st.push("0");
		st.push("1");
		st.push("2");

		qu.add("0");
		qu.add("1");
		qu.add("2");
		
		
		System.out.println("= stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= queue = ");
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
	}

}
