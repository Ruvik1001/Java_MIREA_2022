package lab_17.task_3;

public class LoginModel {
    private String userName, password;
    public LoginModel(){}
    public LoginModel(String userName,String password){
        this.userName = userName;
        this.password= password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
