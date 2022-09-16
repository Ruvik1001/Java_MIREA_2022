package Lab4_1.Library;

public class Book {
    private String name = "X";
    private String author = "X";

    //////////////////////////////////
    public Book() {}

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    //////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAll() {
        return String.format("%-30s \"%s\"", author, name);
    }
}
