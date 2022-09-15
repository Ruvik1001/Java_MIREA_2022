package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sum elems in array
        int arr[];  int n;  Scanner in = new Scanner(System.in);

        System.out.print("Input range of array: ");
        n = in.nextInt();
        arr = new int[n];
        System.out.print("Input " + n + " nums: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        SumInArr sumAll = new SumInArr(arr, n);
        System.out.print("Your res in 3 function: " +
                sumAll.sumFOR() + ", " + sumAll.sumWHILE() + ", " + sumAll.sumDOWHILE());
        System.out.print("\n\n");

        //Show command line args
        System.out.print("Argument in command line: ");
        for (int i = 0; i < args.length; i++)
            System.out.print(args[i]);
        System.out.print("\n\n");

        //The first 10 numbers of the harmonic series
        System.out.print("The first 10 numbers of the harmonic series with formatted: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%-7.2f",1./i);
        }
        System.out.print("\n\n");

        //Random in array and sort
        RandomInArr r = new RandomInArr(arr, n);
        r.withRandom();
        System.out.print("Random with module random: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        r.withMath();
        System.out.print("\nRandom with module Math: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        r.sort();
        System.out.print("\nSorted: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.print("\n\n");

        //Factorial
        System.out.print("Input num for find factorial: ");
        System.out.print("Your result: " + Factorial.fact(in.nextInt()));
    }
}
