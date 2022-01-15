package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx5 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.WEEK_OF_YEAR);
		System.out.println(Calendar.WEEK_OF_MONTH);
		System.out.println(Calendar.DATE);
		System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
		System.out.println("월 (0~11 , 0:1 월)" + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇째 주일까" + today.get(Calendar.WEEK_OF_YEAR));
		
		//DATE  와 DAY_OF_MONTH 는 같다
		System.out.println("이달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이해의 몇 일 : " + today.get(today.get(Calendar.DAY_OF_YEAR)));
		System.out.println("요일(1~7)  1 ==> 일요일   :" + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일" + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 이번에 n 번째 오늘의 요일
		System.out.println("오전_오후 (0:오전, 1: 오후) :" + today.get(Calendar.AM_PM));
		System.out.println("시간 ( 0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("시간 ( 0 ~ 24) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
	
	}
}
