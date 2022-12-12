package lab_6.task_4;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable p1 = new Book(450, "War and Peace");
        p1.getPrice();

        p1 = new Computer(8, "Intel core i7 9750H", 1000, 1000);
        p1.getPrice();

        Book b1 = new Book(450.3, "The Great Gatsby");
        b1.getPrice();
    }
}
