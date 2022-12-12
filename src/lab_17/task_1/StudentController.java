package lab_17.task_1;

public class StudentController {
    private Student model = new Student();
    private StudentView view = new StudentView();

    public  StudentController(){}
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model);
    }

}
