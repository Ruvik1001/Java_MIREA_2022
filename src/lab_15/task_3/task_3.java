package lab_15.task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class task_3 extends JFrame {

    public task_3() {
        init();
    }

    private void init() {
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_F);
        help.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setActionCommand("Save");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.setActionCommand("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.setActionCommand("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.setActionCommand("Paste");

        file.add(saveMenuItem);
        file.add(eMenuItem);
        edit.add(copyMenuItem);
        edit.add(cutMenuItem);
        edit.add(pasteMenuItem);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        setJMenuBar(menubar);

        Button button1 = new Button("Button 1");
        button1.setBounds(10,50,60,30);
        button1.setSize(100,50);
        add(button1);
        Button button2 = new Button("Button 2");
        button2.setBounds(170,50,60,30);
        button2.setSize(100,50);
        add(button2);
        TextField tf = new TextField("This is the area you can write text");
        tf.setBounds(100,50, 250,20);
        add(tf);


        setTitle("Menu Example");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new task_3().setVisible(true);
            }
        });
    }
}