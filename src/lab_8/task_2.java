package lab_8;

import java.util.Scanner;

public class task_2 {
    public static void recursion(int n){
        if(n == 1) return;
        recursion(--n);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value n: ");
        int n = in.nextInt();
        recursion(n + 1);
    }
}
