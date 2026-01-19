package FramesA;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Games extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel bgimglbl;
    private ImageIcon icon,bgimg;
    private JButton logoutbtn,backbtn,prbtn1,prbtn2,prbtn3,prbtn4,prbtn5,prbtn6;
    private Color c1,c2,c3,c4;
    private Font f1,f2,f3;
    private String usern;

    public Games(String s1){
        super("X3RTZY Gaming Shop");
        this.setSize(1024,768);
        this.setLocationRelativeTo(null);
        icon = new ImageIcon("Images/appicon.png");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        usern = s1;
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

        prbtn1 = new JButton("Buy");
        prbtn1.setBounds(188,360,90,40);
        prbtn1.setForeground(Color.WHITE);
        prbtn1.setBackground(c2);
        prbtn1.setFocusPainted(false);
        prbtn1.setFont(f2);
        prbtn1.addActionListener(this);
        panel.add(prbtn1);

        prbtn2 = new JButton("Buy");
        prbtn2.setBounds(466,360,90,40);
        prbtn2.setForeground(Color.WHITE);
        prbtn2.setBackground(c2);
        prbtn2.setFocusPainted(false);
        prbtn2.setFont(f2);
        prbtn2.addActionListener(this);
        panel.add(prbtn2);

		prbtn3 = new JButton("Buy");
        prbtn3.setBounds(744,360,90,40);
        prbtn3.setForeground(Color.WHITE);
        prbtn3.setBackground(c2);
        prbtn3.setFocusPainted(false);
        prbtn3.setFont(f2);
        prbtn3.addActionListener(this);
        panel.add(prbtn3);
		
		prbtn4 = new JButton("Buy");
        prbtn4.setBounds(188,660,90,40);
        prbtn4.setForeground(Color.WHITE);
        prbtn4.setBackground(c2);
        prbtn4.setFocusPainted(false);
        prbtn4.setFont(f2);
        prbtn4.addActionListener(this);
        panel.add(prbtn4);
		
		prbtn5 = new JButton("Buy");
        prbtn5.setBounds(466,660,90,40);
        prbtn5.setForeground(Color.WHITE);
        prbtn5.setBackground(c2);
        prbtn5.setFocusPainted(false);
        prbtn5.setFont(f2);
        prbtn5.addActionListener(this);
        panel.add(prbtn5);
		
		prbtn6 = new JButton("Buy");
        prbtn6.setBounds(744,660,90,40);
        prbtn6.setForeground(Color.WHITE);
        prbtn6.setBackground(c2);
        prbtn6.setFocusPainted(false);
        prbtn6.setFont(f2);
        prbtn6.addActionListener(this);
        panel.add(prbtn6);
		
        bgimg = new ImageIcon("Images/pbg.png");
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

    }
}