package Lab4_1.Persons;

public class Tester {
    public static void main(String... args){
        Person p1 = new Person();
        Person p2 = new Person("Jim A.P.", 15);
        p1.move();
        p2.talk();
    }
}
