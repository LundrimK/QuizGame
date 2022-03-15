package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Enter extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    Enter(String username){
        this.username=username;
        setBounds(600,200,600,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1=new JLabel("Welcome "+username+" to this Simple Quiz");
        l1.setForeground(new Color(30,144,255));
        l1.setFont(new Font("Times New Roman" ,Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);


        JLabel l2=new JLabel("");
        l2.setFont(new Font("Tahoms",Font.PLAIN,16));
        l2.setBounds(20,90,600,350);
        l2.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not story teller,answer point to point"+"<br><br>"+
                        "2. Do not unnecessarily smile at the person sittin next to you,the may also not know the answer"+"<br><br>"+
                        "3. You may have lot of options in life but here all th questions are compulsory"+"<br><br>"+
                        "4. Do not get nervous if your friend is answering more questions"+"<br><br>"+
                        "5. May you know more than other knows,Good luck"+"<br><br>"+
                        "<html"
        );
        add(l2);

        b1=new JButton("Back");
        b1.setBounds(150,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Start");
        b2.setBounds(350,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            this.setVisible(false);
            new Main().setVisible(true);
        }else if(e.getSource()==b2){
            new Quiz(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Enter(" ");
    }


}
