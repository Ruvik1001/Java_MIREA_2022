package lab_7.task_5_6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = in.nextLine();
        ProcessStrings str = new ProcessStrings(string);
        System.out.println("Length: " + str.length());
        System.out.println("Odd String: " + str.strOdd());
        str.reserveString();
        System.out.println("Reserve String: " + str.getStr());
    }
}
