package assignment;

import java.util.Calendar;
import java.util.Date;

public class DueDate {
    

    public static boolean onTime(int year, int month, int day){
    Date dueDate = new Date(year - 1900, month - 1, day, 22, 0);
    Calendar cal = Calendar.getInstance();
    return cal.getTime().compareTo(dueDate) < 0;
    }
    
}