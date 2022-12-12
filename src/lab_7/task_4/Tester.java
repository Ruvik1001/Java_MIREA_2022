package lab_7.task_4;

public class Tester {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();
        System.out.println("2^3 = " + math.pow(2,3));
        System.out.println("Module x = 3 + 4i: " + math.module(3,4));
        System.out.println("The circumference of a circle has R = 3: " + 2 * math.PI() * 3);
    }
}
