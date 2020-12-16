package khosro;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MainPage extends JFrame {
    private Tabs tabs;
    private JButton login;
    private JButton cancel;
    private Image icon;
    public MainPage() {
        super(" Portal");
        icon=ImageFactory.getImage(Images.ICON);
        setSize(1370, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setIconImage(icon);
        tabs =new Tabs();
        add(tabs);

        /*
        JTextArea ta=new JTextArea(200,200);
        JPanel p1=new JPanel();
        p1.add(ta);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        add(tp);
        //setSize(400,400);
        //setLayout(null);*/
        setVisible(true);


    }

    void drawLines(Graphics g) {

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
