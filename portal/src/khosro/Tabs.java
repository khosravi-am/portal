package khosro;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Tabs extends JTabbedPane {
    private Image icon;
    private ProfilePage profile;
    private ReservationPage reserve;
    private PortalPage portal;
    private JPanel panel;
    private Lists list;
    public Tabs(){
        setBounds(0,0,1370,760);
        profile=new ProfilePage();
        reserve = new ReservationPage();
        portal=new PortalPage();
        setProfile();
        panel=new JPanel();
        list=new Lists(new String[]{"Setting","items"});
        panel.setLayout(null);
        panel.add(list);
        panel.add(profile);
        add("Profile",panel);
        add("Reservation Food",reserve);
        add("Educational Portal",portal);
    }

    private void setProfile() {
    }

    void drawLines(Graphics g) {

        if (Main.type.equals("admin"))
            icon=ImageFactory.getImage(Images.ADMIN);
        else if (Main.type.equals("teacher"))
            icon=ImageFactory.getImage(Images.TEACHER);
        else if (Main.type.equals("student"))
            icon=ImageFactory.getImage(Images.STUDENT);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(icon,1050,50,300,250,null);



    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
