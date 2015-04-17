/**
 *
 * Created by jankroon on 17-03-15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientDashboard implements ActionListener {
    JTextField textField1;
    JButton button1;
    JTextArea textArea1;

    // Constructor
//    ClientDashboard() {
//        }

    public void setUpUI() {
        // Window
        JFrame frame = new JFrame();
        frame.setTitle("TranspaBank");

        // GUI Control components
        button1 = new JButton("Enter");
        button1.addActionListener(this);
        textField1 = new JTextField("Voer uw rekeningnummer in");
        textArea1 = new JTextArea("Hier komen meldingen");

        // GUI Content components
        ImagePanel imagePanel = new ImagePanel();

        // GUI containers
        JPanel container = new JPanel();
        container.add(textField1);
        container.add(textArea1);
        container.add(button1);


        frame.getContentPane().add(BorderLayout.SOUTH, container);
        frame.getContentPane().add(BorderLayout.CENTER, imagePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,500);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        button1.setText("I've been clicked");
    }
}
