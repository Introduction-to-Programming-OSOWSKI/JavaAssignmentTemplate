package assignment;

import java.util.Calendar;

public class DueDate {
    

    public static boolean onTime(int year, int month, int day){
    Calendar cal = Calendar.getInstance();
    Calendar due = Calendar.getInstance();
    due.set(year - 1900, month - 1, day, 22, 0);
    return cal.getTime().compareTo(due.getTime()) < 0;
    }
    
}