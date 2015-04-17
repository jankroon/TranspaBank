/**
 * Created by jankroon on 17-03-15.
 */
import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        // Add Image
        Image image = new ImageIcon("bank-transparency.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}