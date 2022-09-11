package Lab3;

public class Book {
    private String name = "NONE";
    private String author = "NONE";
    private String dateOfWriting = "07.01.2003";

    //////////////////////////////////
    public Book() {}

    public Book(String name) {this.name = name;}

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String dateOfWriting) {
        this.name = name;
        this.author = author;
        this.dateOfWriting = dateOfWriting;
    }
    //////////////////////////////////

    public void setAuthor(String author) {this.author = author;}
    public void setName(String name) {this.name = name;}
    public void setDateOfWriting(String dateOfWriting) {this.dateOfWriting = dateOfWriting;}

    public String getAuthor() {return author;}
    public String getName() {return name;}
    public String getDateOfWriting() {return dateOfWriting;}

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfWriting='" + dateOfWriting + '\'' +
                '}';
    }
}
