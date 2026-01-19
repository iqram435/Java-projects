package FramesA;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class FirstPage extends JFrame implements MouseListener, ActionListener {
    private JPanel panel;
    private JLabel userlbl,fpimglbl,gmttlbl,gattlbl,gcttlbl;
    private ImageIcon icon,fpimg;
    private JButton logoutbtn,shpnbtn1,shpnbtn2,shpnbtn3,bgcbtn;
    private Color c1,c2,c3,c4;
    private Font f1,f2,f3;
    private Login lgn;

    public FirstPage(String s1,Login lgn){
        super("X3RTZY Gaming Shop");
        this.setSize(1024,768);
        this.setLocationRelativeTo(null);
        this.lgn=lgn;
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
        userlbl = new JLabel("Hello, "+s1);
        userlbl.setBounds(600,2,300,50);
        userlbl.setForeground(Color.WHITE);
        userlbl.setHorizontalAlignment(JLabel.RIGHT);
        userlbl.setFont(f1);
        panel.add(userlbl);

        logoutbtn = new JButton("Logout");
        logoutbtn.setBounds(915,12,80,30);
        logoutbtn.setForeground(Color.WHITE);
        logoutbtn.setFocusPainted(false);
        logoutbtn.addMouseListener(this);
        logoutbtn.addActionListener(this);
        logoutbtn.setBackground(c2);
        logoutbtn.setFont(f2);
        panel.add(logoutbtn);

        gmttlbl = new JLabel("Popular Games");
        gmttlbl.setBounds(62,315,280,40);
        gmttlbl.setForeground(Color.WHITE);
        gmttlbl.setHorizontalAlignment(JLabel.CENTER);
        gmttlbl.setFont(f3);
        panel.add(gmttlbl);

        gattlbl = new JLabel("Gaming Accessories");
        gattlbl.setBounds(372,315,280,40);
        gattlbl.setForeground(Color.WHITE);
        gattlbl.setHorizontalAlignment(JLabel.CENTER);
        gattlbl.setFont(f3);
        panel.add(gattlbl);

        gcttlbl = new JLabel("In-Game Currency");
        gcttlbl.setBounds(688,315,280,40);
        gcttlbl.setForeground(Color.WHITE);
        gcttlbl.setHorizontalAlignment(JLabel.CENTER);
        gcttlbl.setFont(f3);
        panel.add(gcttlbl);

        shpnbtn1 = new JButton("Shop Now");
        shpnbtn1.setBounds(99,500,160,40);
        shpnbtn1.setForeground(Color.WHITE);
        shpnbtn1.setBackground(c2);
        shpnbtn1.setFont(f2);
        shpnbtn1.setFocusPainted(false);
        panel.add(shpnbtn1);

        shpnbtn2 = new JButton("Shop Gear");
        shpnbtn2.setBounds(430, 500, 160, 40);
        shpnbtn2.setForeground(Color.WHITE);
        shpnbtn2.setBackground(c2);
        shpnbtn2.setFont(f2);
        shpnbtn2.setFocusPainted(false);
        panel.add(shpnbtn2);

        shpnbtn3 = new JButton("Top Up");
        shpnbtn3.setBounds(760, 500, 160, 40);
        shpnbtn3.setForeground(Color.WHITE);
        shpnbtn3.setBackground(c2);
        shpnbtn3.setFont(f2);
        shpnbtn3.setFocusPainted(false);
        panel.add(shpnbtn3);

        bgcbtn = new JButton("Buy Gift Card");
        bgcbtn.setBounds(720, 620, 200, 40);
        bgcbtn.setForeground(Color.WHITE);
        bgcbtn.setBackground(c2);
        bgcbtn.setFont(f2);
        bgcbtn.setFocusPainted(false);
        panel.add(bgcbtn);

        fpimg = new ImageIcon("Images/firstpage.png");
        fpimglbl = new JLabel(fpimg);
        fpimglbl.setBounds(0,0,1024,768);
        panel.add(fpimglbl);

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
		if(me.getSource() == shpnbtn1){
			shpnbtn1.setBackground(c3);
			shpnbtn1.setForeground(Color.BLACK);
		}

		if(me.getSource() == shpnbtn2){
			shpnbtn2.setBackground(c3);
			shpnbtn2.setForeground(Color.BLACK);
		}

		if(me.getSource() == shpnbtn3){
			shpnbtn3.setBackground(c3);
			shpnbtn3.setForeground(Color.BLACK);
        }
		
	    if(me.getSource() == bgcbtn){
        bgcbtn.setBackground(c3);
        bgcbtn.setForeground(Color.BLACK);
		}
    }

    public void mouseExited(MouseEvent me) {
        if(me.getSource()==logoutbtn){
            logoutbtn.setForeground(Color.WHITE);
            logoutbtn.setBackground(c2);
        }
		
		if(me.getSource() == shpnbtn1){
        shpnbtn1.setForeground(Color.WHITE);
        shpnbtn1.setBackground(c2);
		}

		if(me.getSource() == shpnbtn2){
        shpnbtn2.setForeground(Color.WHITE);
        shpnbtn2.setBackground(c2);
		}

		if(me.getSource() == shpnbtn3){
        shpnbtn3.setForeground(Color.WHITE);
        shpnbtn3.setBackground(c2);
		}
		if(me.getSource() == bgcbtn){
			bgcbtn.setForeground(Color.WHITE);
			bgcbtn.setBackground(c2);
		}
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==logoutbtn){
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        }

    }
}