package lab_14.task_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static void main(String[] args) {
        String regex = "(([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("String: 29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("Regex: (([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
