package Lab2;

public class Dog {
    private String name = "NONE";
    private int age = 0;

    //////////////////////////////////
    public Dog() {}

    public Dog(String name) { this.name = name; }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //////////////////////////////////

    public int getAge() { return age; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
