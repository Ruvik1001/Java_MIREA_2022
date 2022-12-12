package lab_6.task_11;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. C, 2. F, 3. K: ");
        int x = in.nextInt();
        String type = null;
        if(x == 1)  type = "C";
        else if(x == 2) type = "F";
        else type = "K";
        System.out.println("Enter temperature: ");
        double temp = in.nextDouble();
        Convert convert = new Convert();
        convert.convert(temp,type);
        do {
            System.out.println("Convert to: ");
            System.out.println("1. C");
            System.out.println("2. F");
            System.out.println("3. K");
            x = in.nextInt();
            switch (x){
                case 1: System.out.println(convert.getC()); break;
                case 2: System.out.println(convert.getF()); break;
                case 3: System.out.println(convert.getK()); break;
                default: break;
            }
        }while (x != 0);
        in.close();
    }
}
