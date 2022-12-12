package lab_6.task_7;

public class Book implements Printable {
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
    public void print(){
        System.out.println("This book is called " + this.name + " and is priced at " + this.price);
    }
}
