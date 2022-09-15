package Lab4.Author;

import Lab4.Author.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("John", "John1999@mail.ru", 'm');
        System.out.print("For author:\n" +
                "toString: " + a.toString() + '\n' +
                "set email (jason@mail.ru) and get it: ");
        a.setEmail("jason@mail.ru");
        System.out.print(a.getEmail() + '\n');
        System.out.print("Get name: " + a.getName() + '\n' +
                "Get gender: " + a.getGender());
    }
}
