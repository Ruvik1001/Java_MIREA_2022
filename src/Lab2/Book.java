package Lab2;

public class Book {
    private String author = "NONE";
    private int pagesCount = 0;

    //////////////////////////////////
    public Book() {}

    public Book(int pagesCount) { this.pagesCount = pagesCount; }

    public Book(String author, int pagesCount) {
        this.pagesCount = pagesCount;
        this.author = author;
    }
    //////////////////////////////////

    public int getPagesCount() { return pagesCount; }
    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }
    public void setPagesCount(int pagesCount) { this.pagesCount = pagesCount; }

    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}