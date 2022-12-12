package lab_8;

import java.util.Scanner;

public class task_4 {
    public static int recursion(int k, int s, int value){
        if(value == Math.pow(10,k)) return 0;
        int sum = 0,temp = value;
        for(int i = 0; i < k; i++){
            sum += value%10;
            value/=10;
        }
        if(sum == s) {
            System.out.println(temp);
            return 1 + recursion(k,s,++temp);
        }
        return recursion(k,s,++temp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = in.nextInt();
        System.out.print("Enter s: ");
        int s = in.nextInt();
        System.out.println("There are " + recursion(k,s, (int)Math.pow(10,k-1)) + " " + k +"-digit numbers whose sum of digits is "+ s +".");
    }
}
