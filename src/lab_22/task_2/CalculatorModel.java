package lab_22.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorModel extends JFrame implements ActionListener {
    private JTextField tfResult;
    private double result = 0;
    private String operator = "=";
    private boolean click = true;

    private Panel panel;

    public CalculatorModel(){
        super("Calculator");
        setSize(400,500);
        setLayout(new BorderLayout());
        tfResult = new JTextField("0");
        tfResult.setEditable(false);
        add(tfResult,"North");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4,4));
        String[] arr = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};
        for (int i = 0; i < arr.length; i++){
            Button button = new Button(arr[i]);
            panel.add(button);
            button.addActionListener(this);
        }
        add(panel,"Center");
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
                    operator = s;
                }
            } else {
                double x = Double.parseDouble(tfResult.getText());
                calculator(x);
                operator = s;
                click = true;
            }
        }
    }
    public void calculator(double n) {
        if (operator.equals("+")) {
            result += n;
        } else if (operator.equals("-")) {
            result -= n;
        } else if (operator.equals("*")) {
            result *= n;
        } else if (operator.equals("/")) {
            result /= n;
        } else if (operator.equals("=")) {
            result = n;
        }

        tfResult.setText(result + "");
    }

    public double getResult() {
        return result;
    }

    public JTextField getTfResult() {
        return tfResult;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public void setTfResult(String text) {
        this.tfResult.setText(text);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }
}
