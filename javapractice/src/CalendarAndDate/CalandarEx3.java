package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx3 {

	public static void main(String[] args) {
		
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간","분","초"};

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY,  20);;
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + toString(time1));
		System.out.println("time2 : " + toString(time2));
		long diff = Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000;
		System.out.println (diff + "초 차이 납니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일" +date.get(Calendar.HOUR_OF_DAY) + "시 "
				+ date.get(Calendar.MINUTE) +"분" + date.get(Calendar.SECOND) + "초";
	
	}
}
