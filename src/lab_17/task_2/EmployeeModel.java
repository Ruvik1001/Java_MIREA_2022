package lab_17.task_2;

public class EmployeeModel {
    private String name;
    private int numberOfWorkingDays;
    private long salary;

    public EmployeeModel(){}
    public EmployeeModel(String name, int numberOfWorkingDays, long salary){
        this.name = name;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
