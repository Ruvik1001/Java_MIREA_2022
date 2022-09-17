package Lab4_1.learners;

public class Main {
    public static void main(String... args) {
        Pupil[] pupils = {
                new Listener("John"),
                new Student("Vik"),
                new Listener("Markus"),
                new Student("Sofi"),
                new Listener("Mark"),
        };

        System.out.print("Listeners:\n");
        for (Pupil pup: pupils) {
            if (pup.getClass() == Listener.class) System.out.println(pup.toString());
        }
        System.out.print("Students:\n");
        for (Pupil pup: pupils) {
            if (pup.getClass() == Student.class) System.out.println(pup.toString());
        }

    }
}