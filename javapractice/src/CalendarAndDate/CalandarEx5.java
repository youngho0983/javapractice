package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx5 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 0, 1);
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + (date.get(Calendar.MONTH) + 1) + "��" + date.get(Calendar.DATE) + "��" +date.get(Calendar.HOUR_OF_DAY) + "�� "
				+ date.get(Calendar.MINUTE) +"��" + date.get(Calendar.SECOND) + "��";
	
	}

}
