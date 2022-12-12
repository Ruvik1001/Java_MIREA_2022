package lab_6.task_7;

public class Test {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book(100,"Nature");
        printables[1] = new Shop("Toys",11111);
        printables[2] = new Book(200,"House");
        printables[3] = new Shop("Book",33221);
        for (int i = 0; i < 4; i++)
            printables[i].print();
    }
}
