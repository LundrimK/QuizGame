package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    JButton next,fifty,submit;
    public static int count=0;
    JLabel l2,l3;
    String pa[][]=new String[10][1];
    String q[][]=new String[10][5];
    String qa[][]=new String[10][2];
    JRadioButton option1,option2,option3,option4;
    ButtonGroup options;
    public static int timer= 15;
    public static int times_given=0;
    public static int score=0;
    static String username;
    Quiz(String username){
        this.username=username;
        setBounds(250,50,1440,950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/quizee.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1440,390);
        add(l1);

        l2=new JLabel("");
        l2.setFont(new Font("Tahoma",Font.PLAIN,24));
        l2.setBounds(100,450,50,30);
        add(l2);

        l3=new JLabel("");
        l3.setFont(new Font("Tahoma",Font.PLAIN,24));
        l3.setBounds(150,450,900,30);
        add(l3);
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";

        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";



        option1=new JRadioButton("");
        option1.setBounds(170,520,700,30);
        option1.setFont(new Font("Tahoma",Font.PLAIN,20));
        option1.setBackground(Color.WHITE);
        add(option1);

        option2=new JRadioButton("");
        option2.setBounds(170,560,700,30);
        option2.setFont(new Font("Tahoma",Font.PLAIN,20));
        option2.setBackground(Color.WHITE);
        add(option2);

        option3=new JRadioButton("");
        option3.setBounds(170,600,700,30);
        option3.setFont(new Font("Tahoma",Font.PLAIN,20));
        option3.setBackground(Color.WHITE);
        add(option3);

        option4=new JRadioButton("");
        option4.setBounds(170,640,700,30);
        option4.setFont(new Font("Tahoma",Font.PLAIN,20));
        option4.setBackground(Color.WHITE);
        add(option4);

        options=new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);

        next=new JButton("Next");
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.addActionListener(this);
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.setBounds(1100,550,200,40);
        add(next);

        fifty=new JButton("50-50 LifeLine");
        fifty.setFont(new Font("Tahoma",Font.PLAIN,22));
        fifty.addActionListener(this);
        fifty.setBackground(new Color(30,144,255));
        fifty.setForeground(Color.WHITE);
        fifty.setBounds(1100,630,200,40);
        add(fifty);

        submit=new JButton("Submit");
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setEnabled(false);
        submit.addActionListener(this);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(1100,710,200,40);
        add(submit);

        start(0);
    }
    public void start(int count){
        l2.setText(""+(count+1)+". ");
        l3.setText(q[count][0]);
        option1.setLabel(q[count][1]);
        option1.setActionCommand(q[count][1]);
        option2.setLabel(q[count][2]);
        option2.setActionCommand(q[count][2]);
        option3.setLabel(q[count][3]);
        option3.setActionCommand(q[count][3]);
        option4.setLabel(q[count][4]);
        option4.setActionCommand(q[count][4]);

        options.clearSelection();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            times_given=1;
            if(options.getSelection()==null){
                pa[count][0]="";
            }else{
                pa[count][0]=options.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(e.getSource()==submit){
            times_given=1;
            if(options.getSelection()==null){
                pa[count][0]="";
            }else{
                pa[count][0]=options.getSelection().getActionCommand();
            }
            for(int i=0;i<pa.length;i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username,score).setVisible(true);
        }else if(e.getSource()==fifty){
            if(count==2 || count==4|| count==6 || count == 8 || count==9){
                option2.setEnabled(false);
                option3.setEnabled(false);
            }else{
                option1.setEnabled(false);
                option4.setEnabled(false);
            }
            fifty.setEnabled(false);
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        String time="Time left: "+timer+ " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));


        if(timer>0){
            g.drawString(time,1100,500);
        }else{
            g.drawString("Times Up!!!!",1100,500);
        }
        timer--;

        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(times_given==1) {
            times_given=0;
            timer = 15;
        }
        else if(timer<0){
            timer=15;
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            if (count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if(count==9){
                if(options.getSelection()==null){
                    pa[count][0]=" ";
                }else{
                    pa[count][0]=options.getSelection().getActionCommand();
                }
                for(int i=0;i<pa.length;i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username,score).setVisible(true);
            }else{
                if(options.getSelection()==null){
                    pa[count][0]=" ";
                }else{
                    pa[count][0]=options.getSelection().getActionCommand();
                }

                count++;
                start(count);
            }
        }
    }

    public static void main(String[] args) {
        new Quiz(username).setVisible(true);
    }


}
