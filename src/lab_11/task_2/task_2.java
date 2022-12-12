package lab_11.task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateStr = in.nextLine();
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(new Date());
        Date date = simpleDateFormat.parse(dateStr);
        cal2.setTime(date);
        if(cal1.after(cal2))
            System.out.println(simpleDateFormat.format(cal1.getTime()) + " is after " + simpleDateFormat.format(cal2.getTime()));
        else if(cal1.before(cal2))
            System.out.println(simpleDateFormat.format(cal1.getTime()) + " is before " + simpleDateFormat.format(cal2.getTime()));
        else
            System.out.println(simpleDateFormat.format(cal1.getTime()) + " is equals " + simpleDateFormat.format(cal2.getTime()));
    }

}
