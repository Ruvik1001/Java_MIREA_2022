package lab_6.task_4;

public class Book implements Priceable {
    private double price;
    private String name;

    Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getPrice() {
        System.out.println("This book is called " + this.name + " and is priced at " + this.price);
    }
}