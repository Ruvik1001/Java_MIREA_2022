package Lab4_1.learners;

public class Pupil {
    protected String name = "NONE";

    public Pupil() {}

    public Pupil(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                '}';
    }
}
