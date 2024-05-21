package design;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;


public class LabelFactory {
    // Method to create a label with specific properties
    public static JLabel createJLabel(String text, String iconPath) {
        JLabel label = new JLabel(text);
        label.setIcon(new ImageIcon(iconPath));
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Impact", Font.PLAIN, 25)); // Change the size as needed
        label.setBorder(new EmptyBorder(12, 0, 7, 0)); // Add margin
        return label;
    }
}
