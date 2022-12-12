package lab_25.task_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String ipAddressPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
            Pattern pattern = Pattern.compile(ipAddressPattern);
            System.out.print("Enter IP: ");
            Matcher matcher = pattern.matcher(in.nextLine());
            System.out.println(matcher.matches());
        }
    }
}
