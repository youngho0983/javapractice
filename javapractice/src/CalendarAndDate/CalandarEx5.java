package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx5 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 0, 1);
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일" +date.get(Calendar.HOUR_OF_DAY) + "시 "
				+ date.get(Calendar.MINUTE) +"분" + date.get(Calendar.SECOND) + "초";
	
	}

}
