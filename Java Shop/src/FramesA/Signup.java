package FramesA;
import Entities.Account;

import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import Entities.*;

public class Signup extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel signuplbl,namelbl,passlbl,cnfpasslbl,numlbl,doblbl,dobfrlbl,emlbl,bglbl;
    private JTextField namefld,numfld,dobfld,emfld;
    private JPasswordField passfld,cnfpassfld;
    private JButton signupbtn,backbtn;
    private Color c1,c2,c3;
    private Font f1,f2;
    private ImageIcon bgimg,icon;

    public Signup(){
        super("X3RTZY Gaming Shop");
        this.setSize(1024,768);
        this.setLocationRelativeTo(null);
        icon = new ImageIcon("Images/appicon.png");
        this.setIconImage(icon.getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        c1 = new Color(29,57,67);
        c2 = new Color(68,141,143);
        c3 = new Color(97,201,204);
        f1 = new Font("Cambria",Font.PLAIN,17);
        f2 = new Font("Cambria",Font.BOLD,25);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);

        signuplbl = new JLabel("Signup Page");
        signuplbl.setBounds(362,20,300,50);
        signuplbl.setForeground(Color.WHITE);
        signuplbl.setFont(f2);
        signuplbl.setHorizontalAlignment(JLabel.CENTER);
        panel.add(signuplbl);

        namelbl = new JLabel("Name :");
        namelbl.setBounds(312,120,300,25);
        namelbl.setForeground(Color.WHITE);
        namelbl.setFont(f1);
        panel.add(namelbl);

        namefld = new JTextField();
        namefld.setBounds(312,145,400,40);
        panel.add(namefld);

        passlbl = new JLabel("Password :");
        passlbl.setBounds(312,200,300,25);
        passlbl.setForeground(Color.WHITE);
        passlbl.setFont(f1);
        panel.add(passlbl);

        passfld = new JPasswordField();
        passfld.setBounds(312,225,400,40);
        panel.add(passfld);

        cnfpasslbl = new JLabel("Confirm Password :");
        cnfpasslbl.setBounds(312, 280, 300, 25);
        cnfpasslbl.setForeground(Color.WHITE);
        cnfpasslbl.setFont(f1);
        panel.add(cnfpasslbl);

        cnfpassfld = new JPasswordField();
        cnfpassfld.setBounds(312, 305, 400, 40);
        panel.add(cnfpassfld);


        numlbl = new JLabel("Number :");
        numlbl.setBounds(312, 360, 300, 25);
        numlbl.setForeground(Color.WHITE);
        numlbl.setFont(f1);
        panel.add(numlbl);

        numfld = new JTextField();
        numfld.setBounds(312, 385, 400, 40);
        panel.add(numfld);

        doblbl = new JLabel("Date of Birth :");
        doblbl.setBounds(312, 440, 150, 25);
        doblbl.setForeground(Color.WHITE);
        doblbl.setFont(f1);
        panel.add(doblbl);
        dobfrlbl = new JLabel("(dd / mm / yyyy)");
        dobfrlbl.setBounds(420, 440, 150, 25);
        dobfrlbl.setForeground(Color.LIGHT_GRAY);

        panel.add(dobfrlbl);

        dobfld = new JTextField();
        dobfld.setBounds(312, 465, 400, 40);
        panel.add(dobfld);

        emlbl = new JLabel("Email :");
        emlbl.setBounds(312, 520, 300, 25);
        emlbl.setForeground(Color.WHITE);
        emlbl.setFont(f1);
        panel.add(emlbl);

        emfld = new JTextField();
        emfld.setBounds(312, 545, 400, 40);
        panel.add(emfld);

        signupbtn = new JButton("Signup");
        signupbtn.setBounds(312,605,190,45);
        signupbtn.setForeground(Color.WHITE);
        signupbtn.setBackground(c2);
        signupbtn.setFont(f1);
        signupbtn.addActionListener(this);
        signupbtn.addMouseListener(this);
        panel.add(signupbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(522,605,190,45);
        backbtn.setForeground(Color.WHITE);
        backbtn.setBackground(c2);
        backbtn.setFont(f1);
        backbtn.addActionListener(this);
        backbtn.addMouseListener(this);
        panel.add(backbtn);

        bgimg = new ImageIcon("Images/signupbg.png");
        bglbl = new JLabel(bgimg);
        bglbl.setBounds(0,0,1024,768);
        panel.add(bglbl);

        this.add(panel);
    }
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==signupbtn){
            signupbtn.setBackground(c3);
            signupbtn.setForeground(Color.BLACK);
        }
        else if(me.getSource()==backbtn){
            backbtn.setBackground(c3);
            backbtn.setForeground(Color.BLACK);
        }
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource()==signupbtn){
            signupbtn.setForeground(Color.WHITE);
            signupbtn.setBackground(c2);
        }
        else if(me.getSource()==backbtn){
            backbtn.setBackground(c2);
            backbtn.setForeground(Color.white);
        }

    }


    public void actionPerformed(ActionEvent ae) {
        String s1 = namefld.getText();
        String s2 = passfld.getText();
        String s3 = numfld.getText();
        String s4 = dobfld.getText();
        String s5 = emfld.getText();
        if(ae.getSource()==signupbtn){
            if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill Up All..!!");
            }
            else if(!s2.equals(cnfpassfld.getText())){
                JOptionPane.showMessageDialog(null,"Password and Confirm Password must be same..!!");
            }
            else{
                Account acc = new Account(s1,s2,s3,s4,s5);
                acc.addAccount();

                JOptionPane.showMessageDialog(null,"Signup Successful");
                this.setVisible(false);
                Login l1 = new Login();
                l1.setVisible(true);
            }

        }
        else if(ae.getSource()==backbtn){
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        }
    }
}