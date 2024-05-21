import javax.swing.*;
import java.awt.*;

import design.ButtonFactory;
import design.LabelFactory;
import design.TablePanel;


public class Interface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j-Curatio");
        frame.setSize(942, 550); // Default size
        frame.setMinimumSize(new Dimension(942, 500)); // Min size
        frame.setMaximumSize(new Dimension(1500, 750)); // Max size
        frame.setLocationRelativeTo(null); // Center the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // Set layout of JFrame to BorderLayout
        
        ImageIcon img_icon = new ImageIcon("ressources/bitmap_curatio.png"); // Set the Icon
        frame.setIconImage(img_icon.getImage());

        // [Panel] Create a panel to hold the label and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.decode("#495057")); // Set background color

        // Create label raws & columns
        JLabel label_raws_columns = LabelFactory.createJLabel("Raws & Columns", "ressources/tableur_logo.png");
        label_raws_columns.setAlignmentX(Component.CENTER_ALIGNMENT);

        // [Panel] Create a new panel for col buttons
        JPanel col_panel = new JPanel();
        col_panel.setLayout(new BoxLayout(col_panel, BoxLayout.X_AXIS));
        col_panel.setBackground(Color.decode("#495057")); // Set background color

        // Create Col buttons
        JButton btn_del_col = ButtonFactory.createButton("Columns", "ressources/del_logo.png");
        col_panel.add(btn_del_col);
        col_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space
        
        JButton btn_add_col = ButtonFactory.createButton("Columns", "ressources/add_logo.png");
        col_panel.add(btn_add_col);
        col_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space
        
        JButton btn_modif_col = ButtonFactory.createButton("Columns", "ressources/modify_logo.png");
        col_panel.add(btn_modif_col);
        col_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        // [Panel] Create a new panel for row buttons
        JPanel row_panel = new JPanel();
        row_panel.setLayout(new BoxLayout(row_panel, BoxLayout.X_AXIS));
        row_panel.setBackground(Color.decode("#495057")); // Set background color

        // Create Row buttons
        JButton btn_del_row = ButtonFactory.createButton("Rows", "ressources/del_logo.png");
        row_panel.add(btn_del_row);
        row_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space
        
        JButton btn_add_row = ButtonFactory.createButton("Rows", "ressources/add_logo.png");
        row_panel.add(btn_add_row);
        row_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space
        
        JButton btn_modif_row = ButtonFactory.createButton("Rows", "ressources/modify_logo.png");
        row_panel.add(btn_modif_row);
        row_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        // [Panel] Create a new panel for Order buttons
        JPanel order_panel = new JPanel();
        order_panel.setLayout(new BoxLayout(order_panel, BoxLayout.X_AXIS));
        order_panel.setBackground(Color.decode("#495057")); // Set background color

        // Create Order buttons
        JButton btn_order = ButtonFactory.createButton("Order By", "ressources/order_logo.png");
        order_panel.add(btn_order);
        order_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_reverse_order = ButtonFactory.createButton("Reverse Order", "ressources/reverse_order_logo.png");
        order_panel.add(btn_reverse_order);
        order_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_interval = ButtonFactory.createButton("Interval", "ressources/interval_logo.png");
        order_panel.add(btn_interval);
        order_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        // Create label miss val
        JLabel label_miss_val = LabelFactory.createJLabel("Missing Values", "ressources/valeur_manquante.png");
        label_miss_val.setAlignmentX(Component.CENTER_ALIGNMENT);

        // [Panel] Create a new panel for Missing Values buttons
        JPanel missing_val_panel = new JPanel();
        missing_val_panel.setLayout(new BoxLayout(missing_val_panel, BoxLayout.X_AXIS));
        missing_val_panel.setBackground(Color.decode("#495057")); // Set background color

        // Create Missing Values buttons
        JButton btn_mean = ButtonFactory.createButton("Means", "", 8, 15, 8, 15);
        missing_val_panel.add(btn_mean);
        missing_val_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_del = ButtonFactory.createButton("Del", "", 8, 15, 8, 15);
        missing_val_panel.add(btn_del);
        missing_val_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_std = ButtonFactory.createButton("Std", "", 8, 15, 8, 15);
        missing_val_panel.add(btn_std);
        missing_val_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_val_def = ButtonFactory.createButton("Val Def", "", 8, 15, 8, 15);
        missing_val_panel.add(btn_val_def);
        missing_val_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        // Create label transfo var
        JLabel label_transfo_var = LabelFactory.createJLabel("Transformation Variables", "ressources/transfo_var.png");
        label_transfo_var.setAlignmentX(Component.CENTER_ALIGNMENT);

        // [Panel] Create a new panel for Missing Values buttons
        JPanel transfo_var_panel = new JPanel();
        transfo_var_panel.setLayout(new BoxLayout(transfo_var_panel, BoxLayout.X_AXIS));
        transfo_var_panel.setBackground(Color.decode("#495057")); // Set background color

        // Create Missing Values buttons
        JButton btn_dtypes = ButtonFactory.createButton("DTypes Object", "", 8, 15, 8, 15);
        transfo_var_panel.add(btn_dtypes);
        transfo_var_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_one_hot = ButtonFactory.createButton("One Hot", "", 8, 15, 8, 15);
        transfo_var_panel.add(btn_one_hot);
        transfo_var_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_dummies = ButtonFactory.createButton("Dummies", "", 8, 15, 8, 15);
        transfo_var_panel.add(btn_dummies);
        transfo_var_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        JButton btn_fusion = ButtonFactory.createButton("Fusion", "", 8, 15, 8, 15);
        transfo_var_panel.add(btn_fusion);
        transfo_var_panel.add(Box.createRigidArea(new Dimension(10, 0))); // Add space

        // [Panel] Create a new panel for the table
        TablePanel tablePanel = new TablePanel();
        
        panel.add(label_raws_columns);
        panel.add(col_panel); // Add Col button panel to main panel
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add vertical separation between panels
        panel.add(row_panel); // Add Row button panel to main panel

        panel.add(Box.createRigidArea(new Dimension(0, 25))); // Add vertical separation between panels
        panel.add(order_panel); // Add Order button panel to main panel

        panel.add(Box.createRigidArea(new Dimension(0, 15))); // Add vertical separation between panels
        panel.add(label_miss_val);
        panel.add(missing_val_panel);
        
        panel.add(Box.createRigidArea(new Dimension(0, 15))); // Add vertical separation between panels
        panel.add(label_transfo_var);
        panel.add(transfo_var_panel);

        frame.add(panel, BorderLayout.WEST); // Add the panel to the frame
        frame.add(tablePanel, BorderLayout.EAST); // Add the tablePanel to the frame
        frame.setVisible(true);
    }
}