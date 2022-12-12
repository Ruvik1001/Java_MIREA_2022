package lab_17.task_3;

public class LoginController {
    private LoginView view;
    public LoginController(LoginView view){
        this.view = view;
    }

    private boolean checkLogin(LoginModel user){
        if((user.getUserName().equals("admin")) && (user.getPassword().equals("admin")))
            return true;
        return false;
    }

    public void login(){
        while (true){
            LoginModel user = view.getUserInfo();
            if(checkLogin(user)){
                view.showMessage("Success!");
                break;
            }
            else
                view.showMessage("Wrong username or password!");
        }
    }

    public void setView(LoginView view) {
        this.view = view;
    }

    public LoginView getView() {
        return view;
    }
}
