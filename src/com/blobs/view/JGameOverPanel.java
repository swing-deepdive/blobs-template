package com.blobs.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JGameOverPanel extends JComponent {
    private JTextField textField = new JTextField(20);

    public JGameOverPanel() {
        this.setBackground(new Color(255, 255, 255));
        setupNameInput();
        this.repaint();
    }

    private void setupNameInput() {
        textField = new JTextField();
        textField.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 32));
        textField.setForeground(new Color(44, 165, 124));
        //textField.setBorder(BorderFactory.createEmptyBorder( 0, 0, 25, 0 ));
        this.add(textField);
    }
}
