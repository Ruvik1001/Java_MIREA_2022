package lab_14.task_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_7 {
    public static void main(String[] args) {
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[\\w]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("F032_Password, TrySpy1, Smart_pass, A007");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
