package CalendarAndDate;

import java.util.Calendar;

public class CalandarEx1 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//date1.set(2021,Calendar.JANUARY, 15);
		date1.set(2020, 2,15);
		
		System.out.println("date1�� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"����");
		System.out.println("date2(����)�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"����");
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("1 ���� 2 ���� " + diff + " �� ����");
		System.out.println(diff/60);
		System.out.println(diff/(60*60));
		System.out.println("�̸� �ϼ��� �ٲٸ� " + diff/(24*60*60));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + (date.get(Calendar.MONTH) + 1) + "��" + date.get(Calendar.DATE) + "��" ;
	}
	
}
