package study.java.abstractClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) throws Exception {
		Calendar calendar = new GregorianCalendar();
		
		System.out.println("Current time is " + new Date());
		
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		
		System.out.println("DATE: " + calendar.get(Calendar.DATE));
		
		System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		
		System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		
		
		 Calendar calendar2 = new GregorianCalendar(1999, 4, 23);
		 
		 System.out.println(calendar2.get(calendar2.DAY_OF_WEEK) );
	}
}
