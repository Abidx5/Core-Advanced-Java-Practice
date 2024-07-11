

package xAdvanceJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTime {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis());
        // System.out.println("Time max can be store = "+Long.MAX_VALUE);

        Date d = new Date();
        System.out.println(d);

        // System.out.println(d.getTime());
        // System.out.println(d.getYear());

        Calendar c = Calendar.getInstance();
        System.out.println("Calander Date = "+Calendar.DATE);

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(cal.isLeapYear(2019));

        System.out.println(TimeZone.getAvailableIDs()[1]);

        LocalDate date = LocalDate.now();
        System.out.println(d);


        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println(dateTime);

        // for format as per need
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dateTime.format(format);
        System.out.println(myDate);
        // for more format read documentation
    }
}
