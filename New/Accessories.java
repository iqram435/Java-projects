package FramesA;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Accessories extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel bgimglbl;
    private ImageIcon icon,bgimg;
    private JButton logoutbtn,backbtn,prbtn1,prbtn2,prbtn3,prbtn4,prbtn5,prbtn6;
    private JLabel titlelbl1,titlelbl2,titlelbl3,titlelbl4,titlelbl5,titlelbl6;
    private JLabel titleplbl1,titleplbl2,titleplbl3,titleplbl4,titleplbl5,titleplbl6;
    private Color c1,c2,c3,c4;
    private Font f1,f2,f3;
    private String usern;

    public Accessories(String s1){
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
        c4 = new Color(220,96,96);
        f1 = new Font("Cambria",Font.PLAIN,22);
        f2 = new Font("Cambria",Font.PLAIN,15);
        f3 = new Font("Cambria",Font.BOLD,20);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);

        usern = s1;

        backbtn = new JButton("Back");
        backbtn.setBounds(10,12,80,30);
        backbtn.setForeground(Color.WHITE);
        backbtn.setFocusPainted(false);
        backbtn.addMouseListener(this);
        backbtn.addActionListener(this);
        backbtn.setBackground(c2);
        backbtn.setFont(f2);
        panel.add(backbtn);

        logoutbtn = new JButton("Logout");
        logoutbtn.setBounds(915,12,80,30);
        logoutbtn.setForeground(Color.WHITE);
        logoutbtn.setFocusPainted(false);
        logoutbtn.addMouseListener(this);
        logoutbtn.addActionListener(this);
        logoutbtn.setBackground(c2);
        logoutbtn.setFont(f2);
        panel.add(logoutbtn);

        titlelbl1 = new JLabel("Assassin's Creed");
        titlelbl1.setBounds(210,250,120,30);
        titlelbl1.setForeground(Color.WHITE);
        titlelbl1.setHorizontalAlignment(JLabel.CENTER);
        titlelbl1.setFont(f2);
        panel.add(titlelbl1);

        titleplbl1 = new JLabel("$10");
        titleplbl1.setBounds(220,270,90,20);
        titleplbl1.setForeground(Color.WHITE);
        titleplbl1.setHorizontalAlignment(JLabel.CENTER);
        titleplbl1.setFont(f2);
        panel.add(titleplbl1);

        titlelbl2 = new JLabel("FIFA 24");
        titlelbl2.setBounds(456,250,120,30);
        titlelbl2.setForeground(Color.WHITE);
        titlelbl2.setHorizontalAlignment(JLabel.CENTER);
        titlelbl2.setFont(f2);
        panel.add(titlelbl2);

        titleplbl2 = new JLabel("$20");
        titleplbl2.setBounds(466,270,90,20);
        titleplbl2.setForeground(Color.WHITE);
        titleplbl2.setHorizontalAlignment(JLabel.CENTER);
        titleplbl2.setFont(f2);
        panel.add(titleplbl2);


        titlelbl3 = new JLabel("Call of Duty: MW");
        titlelbl3.setBounds(700,250,120,30);
        titlelbl3.setForeground(Color.WHITE);
        titlelbl3.setHorizontalAlignment(JLabel.CENTER);
        titlelbl3.setFont(f2);
        panel.add(titlelbl3);

        titleplbl3 = new JLabel("$40");
        titleplbl3.setBounds(700,270,90,20);
        titleplbl3.setForeground(Color.WHITE);
        titleplbl3.setHorizontalAlignment(JLabel.CENTER); titleplbl3.setFont(f2);
        panel.add(titleplbl3);

        titlelbl4 = new JLabel("Minecraft");
        titlelbl4.setBounds(210,570,120,30);
        titlelbl4.setForeground(Color.WHITE);
        titlelbl4.setHorizontalAlignment(JLabel.CENTER);
        titlelbl4.setFont(f2);
        panel.add(titlelbl4);


        titleplbl4 = new JLabel("$30");
        titleplbl4.setBounds(220,590,90,20);
        titleplbl4.setForeground(Color.WHITE);
        titleplbl4.setHorizontalAlignment(JLabel.CENTER); titleplbl4.setFont(f2);
        panel.add(titleplbl4);


        titlelbl5 = new JLabel("Cyberpunk 2077");
        titlelbl5.setBounds(456,570,120,30);
        titlelbl5.setForeground(Color.WHITE);
        titlelbl5.setHorizontalAlignment(JLabel.CENTER);
        titlelbl5.setFont(f2);
        panel.add(titlelbl5);


        titleplbl5 = new JLabel("$40");
        titleplbl5.setBounds(460,590,90,20);
        titleplbl5.setForeground(Color.WHITE);
        titleplbl5.setHorizontalAlignment(JLabel.CENTER); titleplbl5.setFont(f2);
        panel.add(titleplbl5);

        titlelbl6 = new JLabel("Elden Ring");
        titlelbl6.setBounds(700,570,120,30);
        titlelbl6.setForeground(Color.WHITE);
        titlelbl6.setHorizontalAlignment(JLabel.CENTER);
        titlelbl6.setFont(f2);
        panel.add(titlelbl6);


        titleplbl6 = new JLabel("$40");
        titleplbl6.setBounds(710,590,90,20);
        titleplbl6.setForeground(Color.WHITE);
        titleplbl6.setHorizontalAlignment(JLabel.CENTER); titleplbl6.setFont(f2);
        panel.add(titleplbl6);

        prbtn1 = new JButton("Buy");
        prbtn1.setBounds(220, 300, 90, 30);
        prbtn1.setForeground(Color.WHITE);
        prbtn1.setBackground(c2);
        prbtn1.setFocusPainted(false);
        prbtn1.setFont(f2);
        prbtn1.addActionListener(this);
        panel.add(prbtn1);

        prbtn2 = new JButton("Buy");
        prbtn2.setBounds(466, 300, 90, 30);
        prbtn2.setForeground(Color.WHITE);
        prbtn2.setBackground(c2);
        prbtn2.setFocusPainted(false);
        prbtn2.setFont(f2);
        prbtn2.addActionListener(this);
        panel.add(prbtn2);

        prbtn3 = new JButton("Buy");
        prbtn3.setBounds(710, 300, 90, 30);
        prbtn3.setForeground(Color.WHITE);
        prbtn3.setBackground(c2);
        prbtn3.setFocusPainted(false);
        prbtn3.setFont(f2);
        prbtn3.addActionListener(this);
        panel.add(prbtn3);

        prbtn4 = new JButton("Buy");
        prbtn4.setBounds(220, 620, 90, 30);
        prbtn4.setForeground(Color.WHITE);
        prbtn4.setBackground(c2);
        prbtn4.setFocusPainted(false);
        prbtn4.setFont(f2);
        prbtn4.addActionListener(this);
        panel.add(prbtn4);

        prbtn5 = new JButton("Buy");
        prbtn5.setBounds(466, 620, 90, 30);
        prbtn5.setForeground(Color.WHITE);
        prbtn5.setBackground(c2);
        prbtn5.setFocusPainted(false);
        prbtn5.setFont(f2);
        prbtn5.addActionListener(this);
        panel.add(prbtn5);

        prbtn6 = new JButton("Buy");
        prbtn6.setBounds(710, 620, 90, 30);
        prbtn6.setForeground(Color.WHITE);
        prbtn6.setBackground(c2);
        prbtn6.setFocusPainted(false);
        prbtn6.setFont(f2);
        prbtn6.addActionListener(this);
        panel.add(prbtn6);


        bgimg = new ImageIcon("Images/gmac.png");
        bgimglbl = new JLabel(bgimg);
        bgimglbl.setBounds(0,0,1024,768);
        panel.add(bgimglbl);


        this.add(panel);
    }

    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==logoutbtn){
            logoutbtn.setBackground(c4);
            logoutbtn.setForeground(Color.BLACK);
        }
        else if (me.getSource()==backbtn) {
            backbtn.setBackground(c3);
            backbtn.setForeground(Color.BLACK);

        }
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource()==logoutbtn){
            logoutbtn.setForeground(Color.WHITE);
            logoutbtn.setBackground(c2);
        } else if (me.getSource()==backbtn) {
            backbtn.setBackground(c2);
            backbtn.setForeground(Color.WHITE);

        }
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==logoutbtn){
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        } else if (ae.getSource()==backbtn) {
            this.setVisible(false);
            FirstPage fp = new FirstPage(usern,null);
            fp.setVisible(true);
        }
        else if (ae.getSource()==backbtn) {
            this.setVisible(false);
            FirstPage fp = new FirstPage(usern,null);
            fp.setVisible(true);
        }
        else if (ae.getSource()==prbtn1) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
        else if (ae.getSource()==prbtn2) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
        else if (ae.getSource()==prbtn3) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
        else if (ae.getSource()==prbtn4) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
        else if (ae.getSource()==prbtn5) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
        else if (ae.getSource()==prbtn6) {
            JOptionPane.showMessageDialog(null, "Added To Cart");
        }
    }
}