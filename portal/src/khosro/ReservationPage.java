package khosro;

import javax.swing.*;
import java.awt.*;

public class ReservationPage extends JPanel {
    private Image icon,reserve,set;
    private Lists list;
    private SetPanel setPanel;
    private ReservePanel resPanel;

    public ReservationPage(){
        setLayout(null);
        if (Main.type.equals("admin"))
            list=new Lists(new String[]{"Reserve food","Set food"});
        else list=new Lists(new String[]{"Reserve food"});
        add(list);
        setPanel=new SetPanel();
        setPanel.setVisible(false);
        add(setPanel);
        resPanel = new ReservePanel();
        add(resPanel);


    }

}
