package khosro;

import javax.swing.*;
import java.awt.*;

public class ImageFactory {
    public static Image getImage (String address) {
        ImageIcon icon = new ImageIcon(address);
        return icon.getImage();
    }
}
