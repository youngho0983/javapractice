package CollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("help 입력시 도움 받을 수 있음");

		Scanner s = new Scanner(System.in);
		while(true) {

			try {

				System.out.print(">>");
				String input = s.nextLine();
				if("".equals(input)) continue;

				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					save(input);
					System.out.println(" help - 도움말을 보여줍니다. " );
					System.out.println(" q 또는 Q - 종료");
					System.out.println(" history -최근 입력한 명령어를 조여줌");
				} else if(input.equalsIgnoreCase("histoery")) {
					int i =0;
					save(input);
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();

					while(it.hasNext()) System.out.println(++i + ". " + it.next());

				} else {
					save(input);
					System.out.println(input);
				}

			} catch (Exception e) { 
				e.printStackTrace();
			}

		}


	}
	
	public static void save(Object item) {
		if(!"".equals(item)) {
			q.offer(item);
		
			if(q.size() > MAX_SIZE) q.poll();
		}
		
		
		
		
		
	}
}
