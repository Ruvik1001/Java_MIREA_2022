package Lab4_1.ShapeUML;

public class Main {
    public static void main(String... args) {
        Circle      c   = new Circle();
        Rectangle   r   = new Rectangle();
        Square      s   = new Square();
        System.out.print(
                "Create shapes with default ctor:\n" +
                c.toString() + '\n' +
                r.toString() + '\n' +
                s.toString() + "\n\n" +
                "Set different arguments for all\n\n");
        c.setRadius(1.7);   c.setColor("Red");      c.setFilled(true);
        r.setLength(1.2);   r.setWidth(2.7);        r.setFilled(true);
        s.setSide(0.8);     s.setColor("Green");    s.setFilled(true);
        System.out.print(
                "New args:\n" +
                c.toString() + '\n' +
                r.toString() + '\n' +
                s.toString() + '\n');

    }
}
