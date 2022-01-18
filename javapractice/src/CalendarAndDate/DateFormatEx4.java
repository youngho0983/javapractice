
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
		System.out.println("날짜를" + pattern + "형십 입력 해");
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
	
		System.out.println("입력한 날짜왕의 차이 " + day + "밀리초");
	}
}
