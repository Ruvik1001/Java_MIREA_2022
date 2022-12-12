package lab_8;

import java.util.Scanner;

public class task_3 {
    public static void recursion(int a, int b){
        if(a > b) {
            System.out.print(a + " ");
            recursion(--a,b);
        }
        else if (a < b) {
            recursion(a,--b);
            System.out.print(b + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value a,b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        b += (a < b) ? 1 : -1;
        recursion(a,b);
    }
}
