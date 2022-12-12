package lab_18.task_4;

import java.util.Scanner;

public class exceptionDemo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Not int!");
        }finally {
            System.out.println("finally block is always executed");
        }
    }
}
