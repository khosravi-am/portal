package khosro;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


/**
     * This program demonstrates how to draw lines using Graphics2D object.
     * @author www.codejava.net
     *
     */
    public class Main extends JPanel {

        public static String type;
    static JTabbedPane tp;
    public Main() {

        JLabel l = new JLabel("ls");

        JPanel p=new JPanel();
        p.setVisible(false);
        //setVisible(false);
        JButton b = new JButton("HIDE");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                p.setVisible(true);
            }
        });
        p.add(l);
        add(b);
        add(p);


}
    void drawLines(Graphics g) {


    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        BufferedImage i = null;
        try {
            i = ImageIO.read(new File("G:\\myfile\\AUT\\Ap\\tank shooter\\menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g2d.drawLine(120, 50, 360, 50);
        g2d.drawImage(i, 59, 43, 100, 100, null);


        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));

        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));

    }

    public static void main(String[] args) {


        //}
        //String s=LocalDate.now().getDayOfWeek().name();
        //System.out.println(s);
        //System.out.println(LocalDate.now().getDayOfMonth());
        //LocalDate d=LocalDate.now();

        type="admin";
        MainPage p=new MainPage();
       // LoginPage p2=new LoginPage();



        /*
        JFrame f = new JFrame("f");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setVisible(true);


        Thread t = new Thread()
        {
            public void run() {

                try {
                     tp = new JTabbedPane();

                } catch (IllegalArgumentException e) {

                }
            }
        };
        Thread t2 = new Thread()
        {
            public void run() {

                try {
                    Main m = new Main();
                    tp.add("t", m);
                    f.add(tp);

                } catch (IllegalArgumentException e) {

                }
            }
        };


        t.start();
        t2.start();






*/

    }


}


 