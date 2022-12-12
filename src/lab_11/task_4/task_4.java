package lab_11.task_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: "); int year = in.nextInt();
        System.out.print("Enter month: "); int month = in.nextInt();
        System.out.print("Enter date: "); int date = in.nextInt();
        System.out.print("Enter hours: "); int hours = in.nextInt();
        System.out.print("Enter minute: "); int minute = in.nextInt();
        SimpleDateFormat dateFormat = new SimpleDateFormat("<YYYY><MM><dd>\n<hh><mm>");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        calendar.set(Calendar.HOUR, hours);
        calendar.set(Calendar.MINUTE, minute);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
