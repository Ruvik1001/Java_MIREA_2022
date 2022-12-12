package lab_11.task_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class task_1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.MONTH,Calendar.OCTOBER);
        calendar.set(Calendar.DAY_OF_MONTH,26);
        System.out.println("Time to get tasks: " + dateFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_MONTH,29);
        System.out.println("Time to do tasks: " + dateFormat.format(calendar.getTime()));
        calendar.set(Calendar.MONTH,Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH,3);
        System.out.println("Deadline: " + dateFormat.format(calendar.getTime()));
    }
}
