package khosro;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoginPage extends JFrame {
    private Image icon;
    private JButton login;
    private JButton cancel;
    private JButton help;
    private JCheckBox remember;
    private JTextField userName;
    private JPasswordField password;
    private String user="";
    private String pass="";

    public LoginPage() {
        super("Portal Login");
        icon=ImageFactory.getImage(Images.ICON);
        setSize(494, 333);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(2764339));
        textFields();
        checkBox();
        buttons();
        BHandle handle=new BHandle();
        userName.addActionListener(handle);
        password.addActionListener(handle);
        login.addActionListener(handle);
        cancel.addActionListener(handle);
        remember.addActionListener(handle);
        setVisible(true);


    }

    private void buttons() {
        login=new JButton("  LOGIN");
        cancel=new JButton("  CANCEL");
        login.setBackground(new Color(4014667));
        login.setBounds(115,155,157,23);
        login.setBorder(new LineBorder(new Color(8226196), 0));
        login.setForeground(new Color(12764097));
        login.setFont(new Font("default", Font.BOLD, 11));
        login.setHorizontalAlignment(SwingConstants.LEFT);
        add(login);
        cancel.setBackground(new Color(4014667));
        cancel.setBounds(282,155,158,23);
        cancel.setBorder(new LineBorder(new Color(8226196), 0));
        cancel.setForeground(new Color(12764097));
        cancel.setFont(new Font("default", Font.BOLD, 11));
        cancel.setHorizontalAlignment(SwingConstants.LEFT);
        add(cancel);
        help=new JButton("  I CAN'T SIGN IN...");
        help.setBackground(new Color(4014667));
        help.setBounds(230,213,210,23);
        help.setBorder(new LineBorder(new Color(8226196), 0));
        help.setForeground(new Color(12764097));
        help.setFont(new Font("default", Font.BOLD, 11));
        help.setHorizontalAlignment(SwingConstants.LEFT);
        add(help);
    }

    private void checkBox() {
        remember=new JCheckBox("Remember my password");
        remember.setBackground(new Color(2764339));
        remember.setBounds(111,131,200,20);
        remember.setForeground(new Color(8226196));
        remember.setFont(new Font("default", Font.BOLD, 11));
        add(remember);
    }

    private void textFields() {
        userName=new JTextField();
        password=new JPasswordField();
        userName.setBounds(115,69,325,23);
        userName.setBackground(new Color(2764339));
        userName.setBorder(new LineBorder(new Color(8226196), 1));
        userName.setForeground(new Color(12764097));
        userName.setEditable(true);
        password.setBounds(115,103,325,23);
        password.setBackground(new Color(2764339));
        password.setBorder(new LineBorder(new Color(8226196), 1));
        password.setForeground(new Color(12764097));
        password.setEditable(true);
        add(userName);
        add(password);
    }

    void drawLines(Graphics g) {


        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(icon,70,45,46,46,null);
        g2d.setFont(new Font("default", Font.BOLD, 18));
        g2d.setColor(new Color(12764097));
        g2d.drawString("PORTAL",124,75);
        g2d.setFont(new Font("default", Font.BOLD, 11));
        g2d.drawString("User name",52,115);
        g2d.drawString(" Password",52,150);
        g2d.setColor(new Color(4936540));
        g2d.drawLine(30,225,447,225);
        g2d.setColor(new Color(11054246));
        g2d.drawString("Need help with sign in?",100,260);

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    private class BHandle implements ActionListener{

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(login))
                if (userName.getText().equals("admin") && new String(password.getPassword()).equals("1234")) {
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(getContentPane(),"Failed","Result",JOptionPane.ERROR_MESSAGE);
            if (e.getSource().equals(cancel))
                dispose();

        }
    }

}
