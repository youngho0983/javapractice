package innerClass;

import java.awt.Button;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionEvent Occured!!");
			}
		} );
	}
}



//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e ) {
//		System.out.println("ActionEvent Occured!!");
//	}
//}
