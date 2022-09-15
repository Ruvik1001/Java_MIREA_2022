package Lab4_1.Phones;

import java.util.Scanner;

public class Tester {
    public static void main(String... args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("+7(987)833-88-12", "Redmi 9C NFC");
        Phone p3 = new Phone("+7(915)108-55-25", "Real Me 9A", 0.23f);

        System.out.print(
                "Some info about phones with different parameters:\n" +
                p1.toString() + '\n' +
                p2.toString() + '\n' +
                p3.toString() + '\n');
        System.out.print(
                "\nMethod receiveCall: ");
        p1.receiveCall("+7(987)823-12-24");
        System.out.print(
                "Method with name: ");
        p1.receiveCall("Dimon", "+7(908)542-24-32");

        System.out.print(
                "\nMethod getNumber for all phones:\n" +
                p1.getNumber() + '\n' +
                p2.getNumber() + '\n' +
                p3.getNumber() + '\n' + '\n');

        System.out.print(
                "Input count of numbers for msg: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] num = new String[count];
        System.out.print("Input " + count + " numbers\n");
        for (int i = 0; i < count; i++) {
            num[i] = in.next();
        }
        p1.sendMessage(num);
    }
}
