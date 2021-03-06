package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx4 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 7, 31);
		
		System.out.println(toString(date));
		System.out.println("= 1일후 = ");
		date.add(Calendar.DATE, 1 );
		System.out.println(toString(date));
		
		System.out.println("6달 전");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("31일 후 (roll)"); // 날짜 제외 안변함
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		
		System.out.println("31일 후 (add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일" +date.get(Calendar.HOUR_OF_DAY) + "시 "
				+ date.get(Calendar.MINUTE) +"분" + date.get(Calendar.SECOND) + "초";
	
	}

}
