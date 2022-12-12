package lab_15.task_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends JFrame implements ActionListener {
    private JTextField tfResult;
    private double kq = 0;
    private String phep = "=";
    private boolean click = true;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());

        tfResult = new JTextField("0");
        tfResult.setEditable(false);
        add(tfResult, "North");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));
        String[] arr = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};
        for (int i = 0; i < arr.length; i++) {
            Button button = new Button(arr[i]);
            panel.add(button);
            button.addActionListener(this);
        }
        add(panel, "Center");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ('0' <= s.charAt(0) && s.charAt(0) <= '9'
                || s.equals(".")) {
            if (click) {
                tfResult.setText(s);
            } else {
                tfResult.setText(tfResult.getText() + s);
            }

            click = false;
        } else {
            if (click) {
                if (s.equals("-")) {
                    tfResult.setText(s);
                    click = false;
                } else {
                    phep = s;
                }
            } else {
                double x = Double.parseDouble(tfResult.getText());
                calculator(x);
                phep = s;
                click = true;
            }
        }
    }

    public void calculator(double n) {
        if (phep.equals("+")) {
            kq += n;
        } else if (phep.equals("-")) {
            kq -= n;
        } else if (phep.equals("*")) {
            kq *= n;
        } else if (phep.equals("/")) {
            kq /= n;
        } else if (phep.equals("=")) {
            kq = n;
        }

        tfResult.setText(kq + "");
    }

    public static void main(String[] args) {
        new Calculator() .setVisible(true);
    }
}

