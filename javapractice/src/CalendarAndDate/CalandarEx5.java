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
		System.out.println("�� ���� �⵵: " + today.get(Calendar.YEAR));
		System.out.println("�� (0~11 , 0:1 ��)" + today.get(Calendar.MONTH));
		System.out.println("�� ���� ��° ���ϱ�" + today.get(Calendar.WEEK_OF_YEAR));
		
		//DATE  �� DAY_OF_MONTH �� ����
		System.out.println("�̴��� �� �� : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�̴��� �� �� : " + today.get(Calendar.DATE));
		System.out.println("������ �� �� : " + today.get(today.get(Calendar.DAY_OF_YEAR)));
		System.out.println("����(1~7)  1 ==> �Ͽ���   :" + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ����" + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // �̹��� n ��° ������ ����
		System.out.println("����_���� (0:����, 1: ����) :" + today.get(Calendar.AM_PM));
		System.out.println("�ð� ( 0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð� ( 0 ~ 24) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + today.get(Calendar.MINUTE));
	
	}
}
