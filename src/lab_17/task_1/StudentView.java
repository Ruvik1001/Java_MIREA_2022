package lab_17.task_1;

public class StudentView {
    public StudentView(){}
    public void printStudentDetails(Student model){
        System.out.println("Name: " + model.getName() + ", Roll No: " + model.getRollNo());
    }
}
