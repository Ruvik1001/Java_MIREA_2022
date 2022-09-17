package Lab4_1.learners;

public class Student extends Pupil {
    public Student() {}

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
