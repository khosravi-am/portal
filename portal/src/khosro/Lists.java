package khosro;

import javax.swing.*;

public class Lists extends JList<String> {
    public Lists(String[] s){
        super(s);
        setBounds(0,0,150,700);
        setSelectedIndex(0);

    }
}
