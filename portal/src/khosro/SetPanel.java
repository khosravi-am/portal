package khosro;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetPanel extends JPanel {
    private Calendar c;
    private DateFormat df;
    private JTextField sat,sun,mon,tus,wed;
    private JButton save;
    public SetPanel(){
        // Set the calendar to Saturday of the current week
        c = Calendar.getInstance();
        getDate();
        setLayout(null);
        setBounds(0,0,1360,750);
        label();
        texts();
        save();
        setVisible(true);
    }

    private void save() {
        save=new JButton(" save change");
        save.setBackground(new Color(26602));
        save.setBounds(720,500,80,23);
        save.setBorder(new LineBorder(new Color(8226196), 1));
        save.setForeground(new Color(12764097));
        save.setFont(new Font("default", Font.BOLD, 11));
        save.setHorizontalAlignment(SwingConstants.LEFT);
        add(save);
    }

    private void texts() {
        sat=new JTextField();
        mon=new JTextField();
        sun=new JTextField();
        tus=new JTextField();
        wed=new JTextField();
        sat.setBounds(400,160,400,30);
        sat.setBackground(new Color(2764339));
        sat.setBorder(new LineBorder(new Color(8226196), 0));
        sat.setForeground(new Color(12764097));
        sat.setEditable(true);
        mon.setBounds(400,300,400,30);
        mon.setBackground(new Color(2764339));
        mon.setBorder(new LineBorder(new Color(8226196), 0));
        mon.setForeground(new Color(12764097));
        mon.setEditable(true);
        sun.setBounds(400,230,400,30);
        sun.setBackground(new Color(2764339));
        sun.setBorder(new LineBorder(new Color(8226196), 0));
        sun.setForeground(new Color(12764097));
        sun.setEditable(true);
        tus.setBounds(400,370,400,30);
        tus.setBackground(new Color(2764339));
        tus.setBorder(new LineBorder(new Color(8226196), 0));
        tus.setForeground(new Color(12764097));
        tus.setEditable(true);
        wed.setBounds(400,440,400,30);
        wed.setBackground(new Color(2764339));
        wed.setBorder(new LineBorder(new Color(8226196), 0));
        wed.setForeground(new Color(12764097));
        wed.setEditable(true);
        add(sat);
        add(mon);
        add(sun);
        add(tus);
        add(wed);
    }

    private void label() {
        JLabel l=new JLabel(" Next Week:");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 24));
        l.setForeground(new Color(12764097));
        l.setBackground(new Color(26602));
        l.setBounds(200,50,150,30);
        add(l);
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("default", Font.BOLD, 16));
        g2d.setColor(new Color(4014667));
        g2d.drawString(" Saturday",267,170);
        g2d.drawString("   Sunday",267,240);
        g2d.drawString("   Monday",267,310);
        g2d.drawString("  Tuesday",267,380);
        g2d.drawString("Wednesday",250,450);
        g2d.setFont(new Font("default", Font.BOLD, 11));
        g2d.setColor(new Color(8226196));
        g2d.drawString(getTime(0),280,190);
        g2d.drawString(getTime(1),280,260);
        g2d.drawString(getTime(1),280,330);
        g2d.drawString(getTime(1),280,400);
        g2d.drawString(getTime(1),280,470);
        g2d.setColor(new Color(26602));
        g2d.drawLine(385,150,385,480);




    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
    private String getTime(int a){
            c.add(Calendar.DATE, a);
        return df.format(c.getTime());
    }

    private void getDate(){
        df = new SimpleDateFormat("EEE");
        String s=df.format(c.getTime());
        c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        // Print dates of the current week starting on Monday

        if (s.equals("Sat"))
            c.add(Calendar.DATE, 7);
        //System.out.println(s);
        df = new SimpleDateFormat("dd/MM/yyyy");
    }


}
