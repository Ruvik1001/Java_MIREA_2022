package Lab4_1.learners;

public class Listener extends Pupil {
    public Listener() {}

    public Listener(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Listener{" +
                "name='" + name + '\'' +
                '}';
    }
}
