	package CalendarAndDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx3 {

	public static void main(String[] args) { 

		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d;
		try {
			d = df.parse("2015�� 11�� 23��");
			System.out.println(df2.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
