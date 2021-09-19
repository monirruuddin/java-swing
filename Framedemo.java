package com.Swing;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Framedemo extends JFrame{
    private ImageIcon icon,img;
    private Container c;
    private JLabel level1,pass,levelimg;
    private JTextField t1,t2;
    private JButton btn1,btn2;
    private Cursor curson;



      Framedemo() {
        intComponent();
    }
    public void intComponent(){
          icon= new ImageIcon(getClass().getResource("eeee.png"));

          this.setIconImage(icon.getImage());
          c = getContentPane();
          c.setLayout(null);
          c.setBackground(Color.red);
          c.setBackground(Color.white);


          level1 = new JLabel();

          level1.setText("Enter Your Name");
          level1.setBounds(20,50,150,20);
          c.add(level1);
          pass = new JLabel("Enter Your Password");
          pass.setBounds(20,80,150,20);
          c.add(pass);


//          img = new ImageIcon(getClass().getResource("eeee.png"));
//          levelimg = new JLabel(img);
//          levelimg.setBounds(20,100,200,200);
//          c.add(levelimg);

        curson = new Cursor(curson.HAND_CURSOR);
        // Button------------------
        btn1 = new JButton("First");
        btn1.setBounds(20,220,80,30);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setCursor(curson);
        c.add(btn1);

        btn2 = new JButton("Second");
        btn2.setBounds(110,220,80,30);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setCursor(curson);
        c.add(btn2);

          t1 = new JTextField("Name");
          t1.setBounds(20,120,150,30);
//          t1.setHorizontalAlignment(JTextField.RIGHT);
          c.add(t1);

            t2 = new JTextField("Email");
            t2.setBounds(20,180,150,30);
            c.add(t2);



        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s= t1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cheater");
                }else {
                    JOptionPane.showMessageDialog(null,s);
                }

                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String ss= t2.getText();
                        if(s.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Cheater");
                        }else {
                            JOptionPane.showMessageDialog(null,ss);
                        }

                    }
                });


            }
        });




    }


    public static void main(String[] args)  {

//        String name = JOptionPane.showInputDialog("Eter Your Massage");
//        JOptionPane.showMessageDialog(null,name +", Welcome");

        Framedemo frame = new Framedemo();
        frame.setVisible(true);
        frame.getDefaultCloseOperation();
        frame.setBounds(100,100,400,400);
        frame.setTitle("Log In");
        frame.setResizable(false);
    }
}
