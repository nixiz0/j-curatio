package design;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;


public class ButtonFactory {
    // Method to create a button with specific properties
    public static JButton createButton(String text, String iconPath) {
        return createButton(text, iconPath, 3, 5, 3, 5); // Default padding
    }
    
    public static JButton createButton(String text, String iconPath, int top, int left, int bottom, int right) {
        JButton button = new JButton(text);
        if (iconPath != null && !iconPath.isEmpty()) {
            button.setIcon(new ImageIcon(iconPath));
        }
        button.setForeground(Color.WHITE);
        button.setBackground(Color.decode("#343a40"));
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setBorder(BorderFactory.createCompoundBorder(
            new BevelBorder(BevelBorder.RAISED), // Outer border
            new EmptyBorder(top, left, bottom, right) // Inner border for padding
        ));
        return button;
    }
}