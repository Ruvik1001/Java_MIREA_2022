package lab_14.task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_6 {
    public static void main(String[] args) {
        String regex = "[\\w\\-_\\.+]*[\\w\\-_\\.]+\\@([\\w]+\\.)*[\\w]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("String: user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("Regex: [\\w\\-_\\.+]*[\\w\\-_\\.]+\\@([\\w]+\\.)*[\\w]+");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
