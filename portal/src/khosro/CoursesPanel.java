package khosro;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class CoursesPanel extends JPanel {
    private JTable table;
    private JButton add,save,cancel;
    private JPanel newTeacher;
    private JTextField user,pass,units,capacity;
    private JComboBox<String> day;
    private JRadioButton time1,time2,time3;
    public CoursesPanel(){
        setLayout(null);
        setBounds(0,0,1360,750);
        label();
        table();
        button();
        //panel();
        setVisible(true);

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
        user.setFont(new Font("default", Font.BOLD, 15));
        pass.setFont(new Font("default", Font.BOLD, 15));
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
        units=new JTextField();
        capacity=new JTextField();
        units.setFont(new Font("default", Font.BOLD, 15));
        capacity.setFont(new Font("default", Font.BOLD, 15));
        units.setBounds(760,215,300,23);
        units.setBackground(new Color(2764339));
        units.setBorder(new LineBorder(new Color(8226196), 0));
        units.setForeground(new Color(12764097));
        units.setEditable(true);
        capacity.setBounds(760,255  ,300,23);
        capacity.setBackground(new Color(2764339));
        capacity.setBorder(new LineBorder(new Color(8226196), 0));
        capacity.setForeground(new Color(12764097));
        capacity.setEditable(true);
        day=new JComboBox<String>();
        day.setBounds(760,295,300,23);
        day.setBackground(new Color(2764339));
        day.setBorder(new LineBorder(new Color(8226196), 0));
        day.setForeground(new Color(12764097));
        day.addItem("Saturday");
        day.addItem("Sunday");
        day.addItem("Monday");
        day.addItem("Tuesday");
        day.addItem("Wednesday");
        time1=new JRadioButton("8-10");
        time1.setBounds(760,335,60,23);
        time1.setBackground(new Color(15658734));
        time1.setBorder(new LineBorder(new Color(8226196), 0));
        time1.setForeground(new Color(2764339));
        time2=new JRadioButton("10-12");
        time2.setBounds(830,335,60,23);
        time2.setBackground(new Color(15658734));
        time2.setBorder(new LineBorder(new Color(8226196), 0));
        time2.setForeground(new Color(2764339));
        time3=new JRadioButton("14-16");
        time3.setBounds(900,335,60,23);
        time3.setBackground(new Color(15658734));
        time3.setBorder(new LineBorder(new Color(8226196), 0));
        time3.setForeground(new Color(2764339));
        ButtonGroup bg=new ButtonGroup();
        bg.add(time1);
        bg.add(time2);
        bg.add(time3);
        newTeacher.add(user);
        newTeacher.add(pass);
        newTeacher.add(units);
        newTeacher.add(capacity);
        newTeacher.add(day);
        newTeacher.add(time1);
        newTeacher.add(time2);
        newTeacher.add(time3);
    }

    private void labelP() {
        JLabel l=new JLabel("Course Name");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 12));
        l.setForeground(new Color(2764339));
        l.setBounds(680,130,80,18);
        JLabel l2=new JLabel("Course ID");
        l2.setOpaque(true);
        l2.setFont(new Font("default", Font.BOLD, 12));
        l2.setForeground(new Color(2764339));
        l2.setBounds(680,170,70,18);
        JLabel l3=new JLabel("Units:");
        l3.setOpaque(true);
        l3.setFont(new Font("default", Font.BOLD, 12));
        l3.setForeground(new Color(2764339));
        l3.setBounds(680,210,70,18);
        JLabel l4=new JLabel("Capacity");
        l4.setOpaque(true);
        l4.setFont(new Font("default", Font.BOLD, 12));
        l4.setForeground(new Color(2764339));
        l4.setBounds(680,250,70,18);
        JLabel l5=new JLabel("Day");
        l5.setOpaque(true);
        l5.setFont(new Font("default", Font.BOLD, 12));
        l5.setForeground(new Color(2764339));
        l5.setBounds(680,290,70,18);
        JLabel l6=new JLabel("Time");
        l6.setOpaque(true);
        l6.setFont(new Font("default", Font.BOLD, 12));
        l6.setForeground(new Color(2764339));
        l6.setBounds(680,330,70,18);
        newTeacher.add(l);
        newTeacher.add(l2);
        newTeacher.add(l3);
        newTeacher.add(l4);
        newTeacher.add(l5);
        newTeacher.add(l6);
    }

    private void buttonsP() {
        cancel=new JButton("  Cancel");
        cancel.setBackground(new Color(4014667));
        cancel.setBounds(780,370,60,20);
        cancel.setBorder(new LineBorder(new Color(8226196), 0));
        cancel.setForeground(new Color(12764097));
        cancel.setFont(new Font("default", Font.BOLD, 12));
        cancel.setHorizontalAlignment(SwingConstants.LEFT);
        save=new JButton("  Save change");
        save.setBackground(new Color(4014667));
        save.setBounds(680,370,85,20);
        save.setBorder(new LineBorder(new Color(8226196), 0));
        save.setForeground(new Color(12764097));
        save.setFont(new Font("default", Font.BOLD, 12));
        save.setHorizontalAlignment(SwingConstants.LEFT);
        newTeacher.add(save);
        newTeacher.add(cancel);
    }

    private void table() {
        String []column={"Name","ID","unit","time","capacity","D"};

        DefaultTableModel tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        tableModel.addColumn("Course Name");
        tableModel.addColumn("Course ID");
        tableModel.addColumn("unit");
        tableModel.addColumn("time");
        tableModel.addColumn("capacity");
        tableModel.addColumn("");
        tableModel.insertRow(0, column);
        tableModel.insertRow(1, column);
        table.setBounds(155,100,500,500);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(65);
        columnModel.getColumn(5).setPreferredWidth(5);
        table.setEnabled(true);
        //table.setRowSelectionAllowed(true);
       // table.setCellSelectionEnabled(false);
        table.setBorder(new LineBorder(new Color(8226196), 0));
        JScrollPane scrol=new JScrollPane(table);
        scrol.setBounds(155,100,500,500);
        scrol.setBorder(new LineBorder(new Color(8226196), 0));        //table.add(ta);
        add(scrol);
    }

    private void button() {
        add=new JButton(" new");
        add.setBackground(new Color(4014667));
        add.setBounds(670,100,35,23);
        add.setBorder(new LineBorder(new Color(8226196), 0));
        add.setForeground(new Color(12764097));
        add.setFont(new Font("default", Font.BOLD, 11));
        add.setHorizontalAlignment(SwingConstants.LEFT);
        //if (Main.type.equals("teacher"))
        add(add);

    }
    private void label() {
        JLabel l=new JLabel(" Courses:");
        l.setOpaque(true);
        l.setFont(new Font("default", Font.BOLD, 24));
        l.setForeground(new Color(12764097));
        l.setBackground(new Color(26602));
        l.setBounds(155,50,130,30);
        add(l);


    }
}
