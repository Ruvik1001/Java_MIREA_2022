package Lab4_1.Workers;

public class Manager extends Employer {
    private double averageSum = 0d;

    //////////////////////////////////
    public Manager() {}

    public Manager(String firstName, String lastName, double income, double salaryDay, double averageSum) {
        super(firstName, lastName, income, salaryDay);
        this.averageSum = averageSum;
    }
    //////////////////////////////////

    @Override
    public void work(int day) {
        income += day * salaryDay;
        averageSum += day * salaryDay * 0.03;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", income=" + income +
                ", averageSum=" + averageSum +
                ", salaryDay=" + salaryDay +
                '}';
    }
}
