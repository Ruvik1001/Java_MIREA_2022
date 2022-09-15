package Lab4_1.Persons;

public class Person {
    private String fullName = "Ivan I.I.";
    private int age = 22;

    //////////////////////////////////
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    //////////////////////////////////

    public void move() {
        System.out.print(fullName + " go...\n");
    }

    public void talk() {
        System.out.print(fullName + " speak...\n");
    }

}
