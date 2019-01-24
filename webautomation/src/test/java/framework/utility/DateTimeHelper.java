package framework.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Mohan Krishna G
 */
public class DateTimeHelper {

    public static String getCurrentDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar cal = Calendar.getInstance();
        String time = dateFormat.format(cal.getTime());
        return time;
    }

    public static String getCurrentDate() {
        return getCurrentDateTime().substring(0, 11);
    }

}
