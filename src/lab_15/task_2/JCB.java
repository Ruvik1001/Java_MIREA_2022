package lab_15.task_2;

import javax.swing.*;

public class JCB extends JFrame {
    String ct[] = { "Australia", "China", "England", "Russia" };
    JComboBox cb = new JComboBox(ct);

    JCB(){
        super("JCOMBOBOX");
        setLayout(null);
        setSize(400,300);
        cb.setBounds(100,50,150,20);
        add(cb);
    }

    public static void main(String[] args) {
        new JCB().setVisible(true);
    }
}
