package lab_24.task_1;

public class task_1 {
    public interface ComplexAbstractFactory{
        Complex createComplex();
        Complex CreateComplex(int real, int image);
    }
    public static class Complex{
        private int real, image;
        public Complex(){}
        public Complex(int real, int image){
            this.real = real;
            this.image = image;
        }

        @Override
        public String toString() {
            return "Complex{" +
                    "real=" + real +
                    ", image=" + image +
                    '}';
        }
    }
    public static class ConcreteFactory implements ComplexAbstractFactory{

        @Override
        public  Complex createComplex() {
            return new Complex(12,23);
        }

        @Override
        public Complex CreateComplex(int real, int image) {
            return new Complex(real, image);
        }
    }

    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complex_1 = concreteFactory.createComplex();
        Complex complex_2 = concreteFactory.CreateComplex(20,67);
        System.out.println("Complex_1: " + complex_1);
        System.out.println("Complex_2: " + complex_2);
    }
}
