package lab_6.task_3;

public class Plane implements Nameable {
    private String name;

    Plane(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("This plane is called " + this.name);
    }
}
