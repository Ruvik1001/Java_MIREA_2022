package Lab2;

public class Main {
    public static void main(String[] args) {
        System.out.print("For class Dog\n");
        Dog dog = new Dog("Maks", 10);
        System.out.print(dog.toString()+'\n');
        System.out.print("Set new name \"Grom\", set new age \"5\" and output it with different method.\nResult: ");
        dog.setName("Grom");
        dog.setAge(5);
        System.out.print(dog.getName()+", "+dog.getAge()+"\n\n\n");

        System.out.print("For class Ball\n");
        Ball ball = new Ball((float) 0.16, (float) 0.3);
        System.out.print(ball.toString()+'\n');
        System.out.print("Set new radius \"0.3\", set new pressure \"0.78\" and output it with different method.\nResult: ");
        ball.setRadius((float) 0.3);
        ball.setPressure((float) 0.78);
        System.out.print(ball.getRadius()+", "+ ball.getPressure()+"\n\n\n");

        System.out.print("For class Book\n");
        Book book = new Book("John K.P.", 100);
        System.out.print(book.toString()+'\n');
        System.out.print("Set new author \"Rudnev V.V.\", set new pages count \"300\" and output it with different method.\nResult: ");
        book.setAuthor("Rudnev V.V.");
        book.setPagesCount(300);
        System.out.print(book.getAuthor()+", "+ book.getPagesCount());
    }
}

