package Lab4_1.Workers;

public class Employer {
    protected String firstName = "NONE";
    protected String lastName = "NONE";
    protected double income = 0d;
    protected double salaryDay = 120d;

    //////////////////////////////////
    public Employer() {}

    public Employer(String firstName, String lastName, double income, double salaryDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.salaryDay = salaryDay;
    }

    //////////////////////////////////


    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void work(int day) {
        income += day * salaryDay;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", income=" + income +
                ", salaryDay=" + salaryDay +
                '}';
    }
}
