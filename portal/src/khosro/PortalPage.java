package khosro;

import javax.swing.*;

public class PortalPage extends JPanel {
    Lists lists;
    TeacherPanel teachPanel;
    StudentPanel stdPanel;
    CoursesPanel crPanel;
    public PortalPage(){
        setLayout(null);
        if (Main.type.equals("admin"))
            lists=new Lists(new String[]{"Teachers","Courses","Students"});
        else if (Main.type.equals("teachers"))
            lists=new Lists(new String[]{"Courses","Students"});
        else if (Main.type.equals("student"))
            lists=new Lists(new String[]{"Courses"});
        add(lists);
        teachPanel=new TeacherPanel();
        add(teachPanel);
        stdPanel=new StudentPanel();
        add(stdPanel);
        crPanel=new CoursesPanel();
        add(crPanel);



    }
}
