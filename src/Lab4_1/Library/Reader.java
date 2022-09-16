package Lab4_1.Library;

import java.util.*;

public class Reader {
    private String fullName = "NONE";
    private String ticketNum = "xxx xxx";
    private String faculty = "XXX";
    private String dateBirth = "xx.xx.xx";
    private String phoneNum = "+7(xxx)xxx-xx-xx";
    private List<Book> books = new Vector<Book>();

    //////////////////////////////////
    public Reader() {}

    public Reader(String fullName, String ticketNum, String faculty, String dateBirth, String phoneNum) {
        this.fullName = fullName;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNum = phoneNum;
    }
    //////////////////////////////////

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        String str = "";
        for (Book book : books)
            str += book.getAll() + ", ";
        if (str.length() > 0)
            str = str.substring(0, str.length() - 2);
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", ticketNum='" + ticketNum + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", books=[" + str + ']' +
                '}';
    }

    public void takeBook(Book... books) {
        for (Book book : books)
            this.books.add(book);
        System.out.print(
                fullName + " take " + books.length + " books:\n");
        for (Book book : books)
            System.out.print('\t' + book.getAll() + "\n");
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " return:\n");
        for (Book book : books) {
            for (int i = 0; i < this.books.size(); i++) {
                if (book.getAll().equals(this.books.get(i).getAll())) {
                    System.out.print('\t' + this.books.get(i).getAll() + '\n');
                    this.books.remove(i);
                }
            }
        }
    }

    public void takeBook(int count) {
        for (int i = 0; i < count; i++)
            books.add(new Book());
        System.out.print(fullName + " take " + count + " books\n");
    }

    public void returnBook(int count) {
        int i;
        for (i = 0; i < count && books.size() > 0; i++)
            books.remove(books.size() - 1);
        System.out.print(fullName + " return " + i + " books\n");
    }
}
