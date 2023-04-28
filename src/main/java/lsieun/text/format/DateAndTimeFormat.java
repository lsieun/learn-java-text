package lsieun.text.format;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTimeFormat {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2023, Calendar.MAY, 10);
        String s = String.format("The date is: %tm %1$te,%1$tY", c);
        System.out.println(s);
    }
}
