package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx1 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//date1.set(2021,Calendar.JANUARY, 15);
		date1.set(2020, 2,15);
		
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"요일");
		System.out.println("date2(오늘)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("1 부터 2 까지 " + diff + " 초 지남");
		System.out.println(diff/60);
		System.out.println(diff/(60*60));
		System.out.println("이를 일수로 바꾸면 " + diff/(24*60*60));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일" ;
	}
	
}
