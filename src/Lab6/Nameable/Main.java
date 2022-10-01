package Lab6.Nameable;

public class Main {
    private static Airplane plane = new Airplane();
    private static Bus bus = new Bus();

    public static void main(String... args) {
        System.out.println(plane.getName());
        System.out.print(bus.getName());
    }
}
