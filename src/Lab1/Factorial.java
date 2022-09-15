package Lab1;

public class Factorial {
    public static int fact(int num) {
        if (num == 0) return 1;
        return fact(num - 1) * num;
    }
}
