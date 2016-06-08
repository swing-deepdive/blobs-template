package com.blobs.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JGameOverPanel extends JComponent {
    private JLabel name;
    private JTextField textField = new JTextField(20);
    private JLabel gameOver;

    public JGameOverPanel() {
        this.setBackground(new Color(255, 255, 255));
        setupGameOverField();
    }

    private void setupNameField() {
        name = new JLabel("Name: ");
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.BOTTOM);
        name.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 50));
        name.setForeground(Color.WHITE);
        name.setBorder(BorderFactory.createEmptyBorder( 0, 0, 25, 0 ));
        add(name);
    }

    private void setupGameOverField() {
        gameOver = new JLabel("Game Over");
        gameOver.setVisible(false);
        gameOver.setHorizontalAlignment(SwingConstants.CENTER);
        gameOver.setVerticalAlignment(SwingConstants.CENTER);
        gameOver.setFont(new Font("PixelSplitter-Bold", Font.BOLD, 80));
        gameOver.setForeground(new Color(44, 165, 124));
        gameOver.setBorder(BorderFactory.createEmptyBorder( 0, 0, 0, 0 ));
    }
}
