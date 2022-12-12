package lab_16.task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class task_2 extends JFrame {
    JTextArea jTextArea = new JTextArea("Text");
    final DefaultComboBoxModel color = new DefaultComboBoxModel();
    final DefaultComboBoxModel font = new DefaultComboBoxModel();
    JComboBox jComboBox1 = new JComboBox(color);
    JComboBox jComboBox2 = new JComboBox(font);
    JButton showButton = new JButton("Show");

    public task_2(){
        super("task_2");
        setSize(400,500);
        setLayout(new GridLayout(4, 1));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        Font font1 = new Font("Times New Roman", Font.BOLD, 20);
        Font font2 = new Font("MS Sans Serif", Font.BOLD, 20);
        Font font3 = new Font("Courier New", Font.BOLD, 20);
        jTextArea.setFont(font1);
        jTextArea.setForeground(Color.BLUE);
        color.addElement("Blue");
        color.addElement("Red");
        color.addElement("Black");
        font.addElement("Times New Roman");
        font.addElement("MS Sans Serif");
        font.addElement("Courier New");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        add(jTextArea);
        add(jComboBox1);
        add(jComboBox2);
        add(showButton);
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jComboBox1.getSelectedIndex() == 0)
                    jTextArea.setForeground(Color.BLUE);
                else if(jComboBox1.getSelectedIndex() == 1)
                    jTextArea.setForeground(Color.RED);
                else jTextArea.setForeground(Color.BLACK);
                if (jComboBox2.getSelectedIndex()==0) {
                    jTextArea.setFont(font1);
                } else if (jComboBox2.getSelectedIndex()==1)
                    jTextArea.setFont(font2);
                else jTextArea.setFont(font3);
            }
        });
    }

    public static void main(String[] args) {
        new task_2().setVisible(true);
    }
}
