package com.company.bazlur.java_date_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2013, Calendar.FEBRUARY, 28, 13, 24, 56);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t" + dayOfMonth);
        System.out.println("dayOfWeek \t" + dayOfWeek);
        System.out.println("weekOfYear" + weekOfYear);
        System.out.println("weekOfMonth" + weekOfMonth);
    }
}
