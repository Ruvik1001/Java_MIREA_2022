package lab_17.task_1;

public class Student {
    private String rollNo;
    private String name;

    public Student(String name, String rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public Student(){}
    public String getName(){
        return this.name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
