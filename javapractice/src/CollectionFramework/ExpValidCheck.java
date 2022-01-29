package CollectionFramework;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 1 ) {
			System.out.println ("useage : java ExpValidCheck \"Expressin \"");
			System.out.println("Example : java ExpValidcheck \" ((2+3)*1)_3\"");
			System.exit(0);
		}
		Stack st = new Stack();
		
		String expression = args[0];
		
		System.out.println("expression:" + expression);
		
		try {
			for (int i=0; i < expression.length() ; i++ ) {
				char ch = expression.charAt(i);
				
				if(ch=='(') {
					st.push(ch+"");
				} else if(ch==')') {
					st.pop();
				}
			}
			
			if(st.isEmpty() ) { 
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}

}
