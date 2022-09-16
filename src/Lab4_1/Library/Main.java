package Lab4_1.Library;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String... args) {
        System.out.print(
                "Create our reader: ");
        Reader r = new Reader(
                "Ivanov I.I.", "AYV 355", "IT", "10.07.2003", "+7(908)542-57-42");

        System.out.print(r.toString() + '\n' +
                "\nCreate 5 books:\n");
       Book[] books = {
               new Book("War and peace", "Lev Nikolayevich Tolstoy"),
               new Book("Pestilence, the disciple of Death", "Terence David John Pratchett"),
               new Book("Taras Bulba", "Nikolai Vasilyevich Gogol"),
               new Book("The Prophet", "Alexander Sergeyevich Pushkin"),
               new Book("Persian motifs", "Sergey Alexandrovich Yesenin")
       };
       for (Book book : books)
           System.out.println(book.getAll());

       System.out.print("\nTry take 3 books and return they:\n");
       r.takeBook(3);
       r.returnBook(3);

       System.out.print("\nTry take array of book and return they:\n");
       r.takeBook(books);
       r.returnBook(books);

    }
}
