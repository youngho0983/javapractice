
package CalendarAndDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {

	public static void main(String[] args) { 

		String pattern = "yyyy/MM/dd";
		DateFormat df =  new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		System.out.println("��¥��" + pattern + "���� �Է� ��");
		try {
			inDate = df.parse(s.nextLine());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis());
	
		System.out.println("�Է��� ��¥���� ���� " + day + "�и���");
	}
}
