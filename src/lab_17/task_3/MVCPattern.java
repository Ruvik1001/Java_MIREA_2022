package lab_17.task_3;

public class MVCPattern {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);
        control.login();
    }
}
