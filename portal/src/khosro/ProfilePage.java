package khosro;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ProfilePage extends JPanel {
    private Image icon,set,itm;
    private JButton change,save,increase,pay;
    private JTextField user,pass,cardName,price;
    private JPasswordField cardPass;
    private JPanel payPanel;
    public ProfilePage(){
        setLayout(null);
        setBounds(0,0,1360,750);
        buttons();
        texts();
        payPanel();

        setVisible(true);
    }

    private void payPanel() {
        payPanel=new JPanel();
        payPanel.setLayout(null);
        payPanel.setBounds(0,0,1360,750);
        lable();
        pTexts();
        buttonP();
        add(payPanel);
    }

    private void buttonP() {
        pay=new JButton("  Pay");
        pay.setBackground(new Color(4014667));
        pay.setBounds(690,410,40,23);
        pay.setBorder(new LineBorder(new Color(8226196), 0));
        pay.setForeground(new Color(12764097));
        pay.setFont(new Font("default", Font.BOLD, 11));
        pay.setHorizontalAlignment(SwingConstants.LEFT);
        add(pay);
    }

    private void pTexts() {
        cardName=new JTextField();
        price=new JTextField();
        cardPass=new JPasswordField();
        price.setFont(new Font("default", Font.BOLD, 15));
        pass.setFont(new Font("default", Font.BOLD, 15));
        cardPass.setFont(new Font("default", Font.BOLD, 15));
        price.setBounds(690,295,300,23);
        price.setBackground(new Color(2764339));
        price.setBorder(new LineBorder(new Color(8226196), 0));
        price.setForeground(new Color(12764097));
        price.setEditable(true);
        cardName.setBounds(690,335  ,300,23);
        cardName.setBackground(new Color(2764339));
        cardName.setBorder(new LineBorder(new Color(8226196), 0));
        cardName.setForeground(new Color(12764097));
        cardName.setEditable(true);
        cardPass.setBounds(690,375,300,23);
        cardPass.setBackground(new Color(2764339));
        cardPass.setBorder(new LineBorder(new Color(8226196), 0));
        cardPass.setForeground(new Color(12764097));
        cardPass.setEditable(true);
        payPanel.add(cardName);
        payPanel.add(price);
        payPanel.add(cardPass);
    }

    private void lable() {
        JLabel l=new JLabel("price:");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 12));
        l.setForeground(new Color(2764339));
        l.setBounds(625,290,50,18);
        JLabel l2=new JLabel("Credit Card:");
        l2.setOpaque(true);
        l2.setFont(new Font("default", Font.BOLD, 12));
        l2.setForeground(new Color(2764339));
        l2.setBounds(590,330,70,18);
        JLabel l3=new JLabel("Password:");
        l3.setOpaque(true);
        l3.setFont(new Font("default", Font.BOLD, 12));
        l3.setForeground(new Color(2764339));
        l3.setBounds(594,370,70,18);
        payPanel.add(l);
        payPanel.add(l2);
        payPanel.add(l3);

    }

    private void buttons() {
        change=new JButton("  Change profile image");
        change.setBackground(new Color(4014667));
        change.setBounds(185,260,135,20);
        change.setBorder(new LineBorder(new Color(8226196), 0));
        change.setForeground(new Color(12764097));
        change.setFont(new Font("default", Font.BOLD, 11));
        change.setHorizontalAlignment(SwingConstants.LEFT);
        save=new JButton("  Save change");
        save.setBackground(new Color(4014667));
        save.setBounds(330,260,90,20);
        save.setBorder(new LineBorder(new Color(8226196), 0));
        save.setForeground(new Color(12764097));
        save.setFont(new Font("default", Font.BOLD, 11));
        save.setHorizontalAlignment(SwingConstants.LEFT);
        increase=new JButton("  increase account Inventory");
        increase.setBackground(new Color(4014667));
        increase.setBounds(430,260,170,20);
        increase.setBorder(new LineBorder(new Color(8226196), 0));
        increase.setForeground(new Color(12764097));
        increase.setFont(new Font("default", Font.BOLD, 11));
        increase.setHorizontalAlignment(SwingConstants.LEFT);
        add(increase);
        add(save);
        add(change);
    }

    private void texts() {
        user=new JTextField("ADMIN");
        pass=new JTextField("1234");
        user.setBounds(533,62,325,23);
        user.setBackground(new Color(2764339));
        user.setBorder(new LineBorder(new Color(8226196), 1));
        user.setForeground(new Color(12764097));
        user.setEditable(true);
        pass.setBounds(533,102  ,325,23);
        pass.setBackground(new Color(2764339));
        pass.setBorder(new LineBorder(new Color(8226196), 1));
        pass.setForeground(new Color(12764097));
        pass.setEditable(true);
        add(user);
        add(pass);
    }

    void drawLines(Graphics g) {

        icon =ImageFactory.getImage(Images.PROFILE);
        set =ImageFactory.getImage(Images.SETTING);
        itm =ImageFactory.getImage(Images.ICON);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(icon,155,10,200,200,null);
        //g2d.drawImage(set,5,5,20,20,null);
        //g2d.drawImage(itm,5,15,20,20,null);
        //g2d.drawImage(itm,5,25,20,20,null);
        g2d.setFont(new Font("default", Font.BOLD, 24));
        g2d.drawString("User Name: ",399,80);
        g2d.drawString(" Password: ",401,120);
        g2d.drawString("       ID: ",449,160);
        g2d.drawString("current credit:",370,200);
        g2d.drawString("0",533,200);
        g2d.drawString("0",533,160);




    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
