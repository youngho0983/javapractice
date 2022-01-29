package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
	public static void main(String[] argd) {
		ArrayList al = new ArrayList(200000);
		LinkedList ll = new LinkedList();
		
		System.out.println(" =  순차 추가 = ");
		System.out.println("arrayList : " + add1(al));
		System.out.println("KinkedList: " + add1(ll));
		
		System.out.println();
		
		System.out.println("중간에 추가");
		System.out.println("ArrayList" + add2(al));
		System.out.println("KinkedList: " + add2(ll));
		System.out.println();
		
		System.out.println("중간 삭제");
		System.out.println("ArrayList" + remove1(al));
		System.out.println("KinkedList: " + remove1(ll));
		System.out.println();
		

		System.out.println("순차 삭제"); // 예시 문제가 잘못된듯.. 
		System.out.println(al.size());
		System.out.println("ArrayList" + remove2(al));
		System.out.println("KinkedList: " + remove2(ll));
		System.out.println();
		
	}
	
	
	private static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) list.add(i);
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	private static long add2(List list) {
		 
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	private static long remove1(List list) { 
		long start = System.currentTimeMillis();
		for(int i=list.size() -1 ; i>=0 ; i--) {
			list.remove(i);
		}
		
		return start - System.currentTimeMillis();
		
	}
	
	private static long remove2(List list) { 
		long start = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++) {
			list.remove(i);
		}
		
		return start - System.currentTimeMillis();
		
	}
}
