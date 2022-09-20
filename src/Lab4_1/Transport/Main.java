package Lab4_1.Transport;

public class Main {
    public static void main(String... args) {
        Car     c = new Car(100, 5);
        Train   t = new Train(130, 750);
        Plane   p = new Plane(350, 335);
        System.out.print(c.getCostOfTravel(100) + "\n");
        System.out.print(t.getCostOfTravel(100) + "\n");
        System.out.print(p.getCostOfTravel(100));
    }
}
