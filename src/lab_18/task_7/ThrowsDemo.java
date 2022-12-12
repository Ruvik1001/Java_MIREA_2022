package lab_18.task_7;

import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey(){
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        return "data for " + key; }
    public static void main(String[] args) {
        getKey();
    }// end main
}
