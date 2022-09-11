package Lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //For Circle
        System.out.print("Circle\n");
        Circle c = new Circle();
        System.out.print("Standard params: " + c.toString() + '\n' +
                "Pls, set new radius: ");
        c.setRadius(in.nextFloat());
        System.out.print("New params: " + c.toString() + "\n\n");

        //For Human
        System.out.print("Human\n");
        Human h = new Human();
        System.out.print("Standard params: " + h.toString() + '\n' +
                "Pls, set new eyes color: ");
        h.setEyesColor(in.next());
        System.out.print("New params: " + h.toString() + '\n' +
                "Some other method, as go, run, stand, sit, say, shake a hand, welcome and hit:\n");
        h.go();
        h.run();
        h.stand();
        h.sit();
        h.say("Hellow!");
        h.shakeHands();
        h.welcome();
        h.hit();
        System.out.print("\n");

        //For Book
        System.out.print("Book\n");
        Book b = new Book();
        System.out.print("Standard params: " + b.toString() + '\n' +
                "I set some information...\n");
        b.setName("War and Peace");
        b.setAuthor("L.N. Tolstoy");
        b.setDateOfWriting("xx.xx.1869");
        System.out.print("New params: " + b.toString());
    }
}
