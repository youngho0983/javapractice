package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx5 {

	public static void main(String[] args) {
		if(args.length != 2) {
			
		}
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + (date.get(Calendar.MONTH) + 1) + "��" + date.get(Calendar.DATE) + "��" +date.get(Calendar.HOUR_OF_DAY) + "�� "
				+ date.get(Calendar.MINUTE) +"��" + date.get(Calendar.SECOND) + "��";
	
	}

}
