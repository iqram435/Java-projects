package FramesA;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements MouseListener,ActionListener{
    private JPanel panel;
    private JLabel title,wlcmimglbl;
    private ImageIcon wlcmimg,icon;
    private JButton start,exit;
    private Color c1,c2,c3;
    private Font f1,f2;

    public Welcome(){
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
        f1 = new Font("Cambria",Font.PLAIN,24);
        f2 = new Font("Cambria",Font.BOLD,30);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);
        

        start = new JButton("Start");
        start.setBounds(525, 576, 230, 51);
        start.setForeground(Color.WHITE);
        start.setBackground(c2);
        start.setFont(f1);
        start.setFocusPainted(false);
        start.addMouseListener(this);
        start.addActionListener(this);
        panel.add(start);

        exit = new JButton("Exit");
        exit.setBounds(269, 576, 230, 51);
        exit.setForeground(Color.WHITE);
        exit.setBackground(c2);
        exit.setFont(f1);
        exit.setFocusPainted(false);
        exit.addMouseListener(this);
        exit.addActionListener(this);
        panel.add(exit);

        wlcmimg = new ImageIcon("Images/welcome.png");
        wlcmimglbl = new JLabel(wlcmimg);
        wlcmimglbl.setBounds(0,0,1024,768);
        panel.add(wlcmimglbl);


        this.add(panel);
    }
    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){
        if(me.getSource()==start){
            start.setBackground(c3);
            start.setForeground(Color.BLACK);
        }
        else if(me.getSource()==exit){
            exit.setBackground(c3);
            exit.setForeground(Color.BLACK);
        }
    }
    public void mouseExited(MouseEvent me){
        if(me.getSource()==start){
            start.setForeground(Color.WHITE);
            start.setBackground(c2);
        }
        else if(me.getSource()==exit){
            exit.setForeground(Color.WHITE);
            exit.setBackground(c2);
        }
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start) {
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        }
        else if (ae.getSource()==exit){
            this.dispose();
        }

    }
}