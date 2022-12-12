package lab_14.task_4;

public class task_4 {
    public static void main(String[] args) {
        String regex = "(.*\\++.*)";
        System.out.println("(1 + 8) – 9 / 4: " + "(1 + 8) – 9 / 4".matches(regex));
        System.out.println("6 / 5 – 2 * 9: " + "(6 / 5 – 2 * 9".matches(regex));

    }
}
