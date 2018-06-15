package task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cd = Calendar.getInstance();

        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dt.format(cd.getTime()));
        cd.add(5,1);
        cd.add(10,1);
        System.out.println(dt.format(cd.getTime()));
        DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA).format(date));

    }
}
