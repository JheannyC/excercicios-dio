package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBirth {
    public static void main(String[] args) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = sdf.parse("1992-05-14 7:30:00.000");
        Date date2 = sdf.parse("2010-05-15 7:30:00.000");

        System.out.println(date.getTime());
        System.out.println(date2.getTime());

        System.out.println(date.before(date2));
        System.out.println(date.after(date2));

    }
}
