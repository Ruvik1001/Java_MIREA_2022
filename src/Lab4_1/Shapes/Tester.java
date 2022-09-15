package Lab4_1.Shapes;

public class Tester {
    public static void main(String[] args) {
        System.out.print(
                "Inheritance test from the Shape " +
                "virtual class using the Circle " +
                "class as an example\n\n");
        Circle c = new Circle(1.75d);
        System.out.print(
                "Some information (redefined): " + c.toString() + '\n' +
                "Redefined method getType: " + c.getType() + '\n' +
                "Redefined method getArea: " + c.getArea() + '\n' +
                "Redefined method getPerimeter: " + c.getPerimeter() + '\n');
    }
}
