package design;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TablePanel extends JPanel {
    public TablePanel() {
        setLayout(new BorderLayout()); // Set layout manager to BorderLayout

        // Create a table model and set a Column Identifiers to this model 
        DefaultTableModel model = new DefaultTableModel();

        // Create a table and set model to table
        JTable table = new JTable();
        table.setModel(model);

        // Add the table to a scrolling pane, add scrolling pane to the panel
        JScrollPane pane = new JScrollPane(table);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(pane, BorderLayout.CENTER); // Add pane to the center of the panel

        // Create a file chooser
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV & SQL Files", "csv", "sql");
        fileChooser.setFileFilter(filter);

        // Create a button to open the file chooser
        JButton openButton = new JButton("Open File");
        openButton.addActionListener(e -> {
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                // Load CSV or SQL file
                try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                    String line;
                    if ((line = br.readLine()) != null) {
                        // Set column identifiers from the first line of the file
                        model.setColumnIdentifiers(line.split(","));
                    }
                    while ((line = br.readLine()) != null) {
                        model.addRow(line.split(","));
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        add(openButton, BorderLayout.SOUTH); // Add openButton to the bottom of the panel
    }
}
