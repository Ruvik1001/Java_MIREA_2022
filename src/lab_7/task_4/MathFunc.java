package lab_7.task_4;

public class MathFunc implements MathCalculable{
    MathFunc(){}
    public double sqrt(int number){
        double epsilon = 0.0001;
        double result = 1.0f;
        while (Math.abs(result * result - number) / number >= epsilon)
            result = (number / result  - result) / 2 + result;
        return result;
    }
    @Override
    public double pow(double x, double y) {
        for (int i = 1; i < y; i++)
            x *= x;
        return x;
    }

    @Override
    public double module(double x, double y) {
        return sqrt((int)(pow(x,2)+pow(y,2)));
    }

    @Override
    public double PI() {
        return 3.14;
    }
}
