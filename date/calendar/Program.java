package date.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter a date: ");
			String ymd = sc.nextLine();
			String hs = sc.nextLine();
			/*
			 * Считываем год, месяц и день
			 */
			Scanner sc1 = new Scanner(ymd);
			int year = sc1.nextInt();
			int month = sc1.nextInt() - 1;
			int day = sc1.nextInt();
			/*
			 * Считываем часы и минуты
			 */
			Scanner sc2 = new Scanner(hs);
			int hours = sc2.nextInt();
			int min = sc2.nextInt();
			/*
			 * Создаем календарь и дату
			 */
			Calendar calendar = new GregorianCalendar(year, month, day, hours, min);
			year = year - 1900;
			Date date = new Date(year, month, day, hours, min);
			System.out.println(calendar.getTime());
			System.out.println(date.toLocaleString());
			sc1.close();
			sc2.close();
			System.out.println();
		}
		sc.close();
		
	}
}
