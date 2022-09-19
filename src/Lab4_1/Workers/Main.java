package Lab4_1.Workers;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        System.out.print(
                "Employer get 1200 scores on day, Manager get 3% how a bonus\n" +
                "Create array for Employer and Manager.\n" +
                "Input work day for they: ");

        Employer[] workers = {
                new Employer("Ivan","Ivanov", 0, 1200),
                new Manager("Maks", "Abramov", 0, 1200, 0)
        };

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        for (Employer man : workers)
            man.work(day);

        System.out.print(
                "Workers data:\n" +
                workers[0].toString() + '\n' +
                workers[1].toString() + "\n\n" +
                String.format("%-20s %.1f", "Ivanov I. income:", workers[0].getIncome()) + '\n' +
                String.format("%-20s %.1f","Abramov M. income:", workers[1].getIncome()));
    }
}
