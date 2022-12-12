package lab_17.task_2;

public class EmployeeController {
    private EmployeeView view;
    public EmployeeController(EmployeeView view){
        this.view = view;
    }

    public long getSalaryMonth(){
        EmployeeModel model = view.getEmployeeInfo();
        return model.getSalary()*model.getNumberOfWorkingDays();
    }

    public EmployeeView getView() {
        return view;
    }

    public void setView(EmployeeView view) {
        this.view = view;
    }
}
