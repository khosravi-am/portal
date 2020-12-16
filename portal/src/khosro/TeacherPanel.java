package khosro;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TeacherPanel extends JPanel {
    private ArrayList<String> teachers;
    private JTable table;
    private JButton add,save,cancel;
    private JPanel newTeacher;
    private JTextField user,pass,id;
    public TeacherPanel(){
        setLayout(null);
        setBounds(0,0,1360,750);
        label();
        table();
        button();
        panel();
        setVisible(false);

    }

    private void panel() {
        newTeacher = new JPanel();
        newTeacher.setLayout(null);
        newTeacher.setBounds(0,0,1360,750);
        labelP();
        textP();
        buttonsP();
        add(newTeacher);
    }

    private void textP() {
        user=new JTextField();
        pass=new JTextField();
        id=new JTextField();
        user.setFont(new Font("default", Font.BOLD, 15));
        pass.setFont(new Font("default", Font.BOLD, 15));
        id.setFont(new Font("default", Font.BOLD, 15));
        user.setBounds(760,135,300,23);
        user.setBackground(new Color(2764339));
        user.setBorder(new LineBorder(new Color(8226196), 0));
        user.setForeground(new Color(12764097));
        user.setEditable(true);
        pass.setBounds(760,175  ,300,23);
        pass.setBackground(new Color(2764339));
        pass.setBorder(new LineBorder(new Color(8226196), 0));
        pass.setForeground(new Color(12764097));
        pass.setEditable(true);
        id.setBounds(760,215,300,23);
        id.setBackground(new Color(2764339));
        id.setBorder(new LineBorder(new Color(8226196), 0));
        id.setForeground(new Color(12764097));
        id.setEditable(true);
        newTeacher.add(user);
        newTeacher.add(pass);
        newTeacher.add(id);
    }

    private void labelP() {
        JLabel l=new JLabel("User Name:");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 12));
        l.setForeground(new Color(2764339));
        l.setBounds(685,130,70,18);
        JLabel l2=new JLabel(" Password:");
        l2.setOpaque(true);
        l2.setFont(new Font("default", Font.BOLD, 12));
        l2.setForeground(new Color(2764339));
        l2.setBounds(686,170,70,18);
        JLabel l3=new JLabel("    ID:");
        l3.setOpaque(true);
        l3.setFont(new Font("default", Font.BOLD, 12));
        l3.setForeground(new Color(2764339));
        l3.setBounds(723,210,70,18);
        newTeacher.add(l);
        newTeacher.add(l2);
        newTeacher.add(l3);
    }

    private void buttonsP() {

        cancel=new JButton("  Cancel");
        cancel.setBackground(new Color(4014667));
        cancel.setBounds(780,265,60,20);
        cancel.setBorder(new LineBorder(new Color(8226196), 0));
        cancel.setForeground(new Color(12764097));
        cancel.setFont(new Font("default", Font.BOLD, 12));
        cancel.setHorizontalAlignment(SwingConstants.LEFT);
        save=new JButton("  Save change");
        save.setBackground(new Color(4014667));
        save.setBounds(680,265,85,20);
        save.setBorder(new LineBorder(new Color(8226196), 0));
        save.setForeground(new Color(12764097));
        save.setFont(new Font("default", Font.BOLD, 12));
        save.setHorizontalAlignment(SwingConstants.LEFT);
        newTeacher.add(save);
        newTeacher.add(cancel);
    }

    private void button() {
        add=new JButton(" new");
        add.setBackground(new Color(4014667));
        add.setBounds(670,100,35,23);
        add.setBorder(new LineBorder(new Color(8226196), 0));
        add.setForeground(new Color(12764097));
        add.setFont(new Font("default", Font.BOLD, 11));
        add.setHorizontalAlignment(SwingConstants.LEFT);
        add(add);

    }

    private void table() {
        String []column={"Name","ID","das"};

        DefaultTableModel tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        tableModel.addColumn("User Name");
        tableModel.addColumn("ID");
        tableModel.addColumn("Password");
        tableModel.insertRow(0, column);
        tableModel.insertRow(1, column);
        table.setBounds(250,100,400,500);
        table.setEnabled(false);
        table.setBorder(new LineBorder(new Color(8226196), 0));
        JScrollPane scrol=new JScrollPane(table);
        scrol.setBounds(250,100,400,500);
        scrol.setBorder(new LineBorder(new Color(8226196), 0));        //table.add(ta);
        add(scrol);
    }

    private void label() {
        JLabel l=new JLabel(" Teachers:");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 24));
        l.setForeground(new Color(12764097));
        l.setBackground(new Color(26602));
        l.setBounds(200,50,130,30);
        add(l);


    }
}
