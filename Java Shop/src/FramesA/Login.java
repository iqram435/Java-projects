package FramesA;
import Entities.*;

import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel namelbl,passlbl,lgntyplbl,lgnimglbl,lgnlbl;
    private JTextField namefld;
    private JPasswordField passfld;
    private ImageIcon lgnimg,icon;
    private JRadioButton rb1,rb2;
    private ButtonGroup bg1;
    private JButton loginbtn,signbtn,backbtn;
    private Color c1,c2,c3;
    private Font f1,f2,f3;

    public Login(){
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
        f1 = new Font("Cambria",Font.PLAIN,22);
        f2 = new Font("Cambria",Font.PLAIN,19);
        f3 = new Font("Cambria",Font.BOLD,30);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);

        lgnlbl = new JLabel("Login");
        lgnlbl.setBounds(252,20,520,50);
        lgnlbl.setForeground(Color.WHITE);
        lgnlbl.setHorizontalAlignment(JLabel.CENTER);
        lgnlbl.setFont(f3);
        panel.add(lgnlbl);

        lgntyplbl = new JLabel("Select Login Type :");
        lgntyplbl.setBounds(252, 90, 520, 50);
        lgntyplbl.setForeground(Color.WHITE);
        lgntyplbl.setFont(f1);
        panel.add(lgntyplbl);

        rb1 = new JRadioButton("Admin");
        rb1.setBounds(352,145,120,35);
        rb1.setForeground(Color.WHITE);
        rb1.setFont(f2);
        rb1.setFocusPainted(false);
        rb1.setOpaque(false);
        panel.add(rb1);

        rb2 = new JRadioButton("User");
        rb2.setBounds(512,145,120,35);
        rb2.setForeground(Color.WHITE);
        rb2.setFont(f2);
        rb2.setSelected(true);
        rb2.setFocusPainted(false);
        rb2.setOpaque(false);
        panel.add(rb2);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        namelbl = new JLabel("Name :");
        namelbl.setBounds(252, 190, 520, 40);
        namelbl.setForeground(Color.WHITE);
        namelbl.setFont(f1);
        panel.add(namelbl);


        namefld = new JTextField();
        namefld.setBounds(252, 235, 520, 55);
        panel.add(namefld);

        passlbl = new JLabel("Password :");
        passlbl.setBounds(252, 305, 520, 40);
        passlbl.setForeground(Color.WHITE);
        passlbl.setFont(f1);
        panel.add(passlbl);

        passfld = new JPasswordField();
        passfld.setBounds(252, 350, 520, 55);
        panel.add(passfld);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(252, 520, 166, 50);
        loginbtn.setBackground(c2);
        loginbtn.setFont(f1);
        loginbtn.setForeground(Color.WHITE);
        loginbtn.setFocusPainted(false);
        loginbtn.addMouseListener(this);
        loginbtn.addActionListener(this);
        panel.add(loginbtn);

        signbtn = new JButton("Signup");
        signbtn.setBounds(428, 520, 166, 50);
        signbtn.setBackground(c2);
        signbtn.setFont(f1);
        signbtn.setForeground(Color.WHITE);
        signbtn.setFocusPainted(false);
        signbtn.addMouseListener(this);
        signbtn.addActionListener(this);
        panel.add(signbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(604, 520, 168, 50);
        backbtn.setBackground(c2);
        backbtn.setFont(f1);
        backbtn.setForeground(Color.WHITE);
        backbtn.setFocusPainted(false);
        backbtn.addMouseListener(this);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        lgnimg = new ImageIcon("Images/login.png");
        lgnimglbl = new JLabel(lgnimg);
        lgnimglbl.setBounds(0,0,1024,768);
        panel.add(lgnimglbl);

        this.add(panel);
    }

    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==loginbtn){
            loginbtn.setBackground(c3);
            loginbtn.setForeground(Color.BLACK);
        }
        else if(me.getSource()==signbtn){
            signbtn.setBackground(c3);
            signbtn.setForeground(Color.BLACK);
        }
        else if(me.getSource()==backbtn){
            backbtn.setBackground(c3);
            backbtn.setForeground(Color.BLACK);

        }
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource()==loginbtn){
            loginbtn.setForeground(Color.WHITE);
            loginbtn.setBackground(c2);
        }
        else if(me.getSource()==signbtn){
            signbtn.setForeground(Color.WHITE);
            signbtn.setBackground(c2);
        }
        else if(me.getSource()==backbtn){
            backbtn.setBackground(c2);
            backbtn.setForeground(Color.white);

        }
    }


    public void actionPerformed(ActionEvent ae) {
        String s1 = namefld.getText();
        String s2 = passfld.getText();
        if(ae.getSource()==signbtn){
            this.setVisible(false);
            Signup sn1 = new Signup();
            sn1.setVisible(true);
        } else if (ae.getSource() == loginbtn) {

            if (s1.isEmpty() || s2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Input Name and Password");
                return;
            }
            if (rb1.isSelected()) {
                AdminAccount admin = new AdminAccount();

                if (admin.getAdminAccount(s1, s2)) {
                    JOptionPane.showMessageDialog(null, "Admin Login Successful");
                    this.setVisible(false);

                    AdminDashboard ad = new AdminDashboard(s1,this);
                    ad.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Admin Name or Password");
                }
            }
            else if (rb2.isSelected()) {
                Account user = new Account();

                if (user.getAccount(s1, s2)) {
                    JOptionPane.showMessageDialog(null, "User Login Successful");
                    this.setVisible(false);

                    FirstPage f1 = new FirstPage(s1, this);
                    f1.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Wrong User Name or Password");
                }
            }
        }

        else if (ae.getSource()==backbtn){
            this.setVisible(false);
            Welcome w = new Welcome();
            w.setVisible(true);
        }
    }
}