package lab_20.task_4;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println("Divide: " + Calculator.divide(a,b));
        System.out.println("Sum: " +Calculator.sum(a,b));
        System.out.println("Sub: " + Calculator.subtraction(a,b));
        System.out.println("Multiply: " + Calculator.multiply(a,b));
    }
}
