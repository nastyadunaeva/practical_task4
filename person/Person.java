package person;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person {
	Calendar birthday;
	
	public Person() {}
	
	public Calendar getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	/*
	 * Метод возвращает строку с датой дня
	 * рождения в заданном формате
	 */
	public String toString(String format) {
		SimpleDateFormat format1 = new SimpleDateFormat(format);
		String formatted = format1.format(birthday.getTime());
		return formatted;
	}

}
