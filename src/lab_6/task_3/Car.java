package lab_6.task_3;

public class Car implements Nameable {
    private String name;

    Car(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("This car is called " + this.name);
    }
}