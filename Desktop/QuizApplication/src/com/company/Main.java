package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    Main(){
        setBounds(500,200,1200,500);
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/login.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);

        JLabel l2=new JLabel("Simple Quiz");
        l2.setFont(new Font("Mongolian Baliti",Font.BOLD,40));
        l2.setForeground(new Color(30,144,254));
        l2.setBounds(750,60,300,45);
        add(l2);

        JLabel l3=new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baliti",Font.BOLD,20));
        l3.setForeground(new Color(30,144,254));
        l3.setBounds(800,150,300,25);
        add(l3);

        t1=new JTextField();
        t1.setBounds(730,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);

        b1=new JButton("Enter");
        b1.setBounds(735,270,120,25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Exit");
        b2.setBounds(935,270,120,25);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String name= t1.getText();
            this.setVisible(false);
            new Enter(name);
        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Main();
    }


}
