package Lab5.Match;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JLabel label1, label2, label3;
    JButton button1, button2;
    int com1, com2;
    String name1, name2, win, last;
    Listener listener = new Listener();

    public Frame(String title, String nameCom1, String nameCom2) {
        super(title);

        com1 = com2 = 0;
        name1 = nameCom1;
        name2 = nameCom2;
        last = win = "N/A";

        setLayout(new FlowLayout());
        label1  = new JLabel("Last gol: " + last);
        label2  = new JLabel("Score: " + com1 + " X " + com2);
        label3  = new JLabel("Winner: " + win);

        button1 = new JButton(name1);
        button2 = new JButton(name2);

        add(label1);
        add(label2);
        add(label3);
        add(button1);
        add(button2);

        button1.addActionListener(listener);
        button2.addActionListener(listener);
    }

    public void update() {
        label1.setText("Last gol: " + last);
        label2.setText("Score: " + com1 + " X " + com2);
        if (com1 > com2)
            win = name1;
        else if (com1 < com2)
            win = name2;
        else
            win = "N/A";
        label3.setText("Winner: " + win);
    }

    public class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                com1++;
                last = name1;
            }
            if (e.getSource() == button2) {
                com2++;
                last = name2;
            }
            update();
        }
    }
}
