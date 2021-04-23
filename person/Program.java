package person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Program {
	public static void main(String[] args) {
		Person p1 = new Person();
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, 2017);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		calendar.set(Calendar.HOUR_OF_DAY, 19);
		calendar.set(Calendar.MINUTE, 42);
		calendar.set(Calendar.SECOND, 12);
		p1.setBirthday(calendar);
		/*
		 * Вывод даты в трех форматах
		 */
		System.out.println(p1.toString("yyyy-MM-dd"));
		System.out.println(p1.toString("yyyy/MM/dd HH:mm:ss"));
		System.out.println(p1.toString("dd MMM yy GG"));
	}
	
}
