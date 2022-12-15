package lab_16.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame implements ActionListener {
    JLabel lbService = new JLabel("Service: ");
    JLabel lbUser = new JLabel("Username: ");
    JLabel lbPassword = new JLabel("Password: ");
    JTextField txtService = new JTextField();
    JTextField txtUser = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    JButton btnSave = new JButton("Log in");
    JButton btnCancel = new JButton("Cancel");

    public LogIn(String title) {
        super(title);
        Container con = this.getContentPane();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(lbService);
        panel1.add(txtService);
        panel1.add(lbUser);
        panel1.add(txtUser);
        panel1.add(lbPassword);
        panel1.add(txtPassword);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(btnSave);
        panel2.add(btnCancel);

        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);

        con.add(panel1);

        con.add(panel2, "South");


        this.pack();
        this.setSize(400,200);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Save")) {
            String userName = txtUser.getText();
            String passWord = txtPassword.getText();
        } else {
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new LogIn("Sign Up");
    }
}
