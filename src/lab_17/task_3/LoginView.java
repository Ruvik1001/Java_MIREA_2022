package lab_17.task_3;

import java.util.Scanner;

public class LoginView {
  public static Scanner in = new Scanner(System.in);

  public void showMessage(String msg){
      System.out.println(msg);
  }
  public LoginModel getUserInfo(){
      LoginModel user = new LoginModel();
      System.out.print("Username: ");
      user.setUserName(in.next());
      System.out.print("Password: ");
      user.setPassword(in.next());
      return user;
  }
}
