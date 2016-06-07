package com.blobs.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 08.06.16.
 */
public class JBlobGrid extends GridLayout {

    public JBlobGrid(int rows, int cols) {
        super(rows, cols);
    }

    public void init(Container pane) {
        final JPanel jblobGridPanel = new JPanel();
        jblobGridPanel.setLayout(this);

        ImageIcon image = new ImageIcon("image/pic1.jpg");
        JLabel label = new JLabel("", image, JLabel.CENTER);

        //Add buttons to experiment with Grid Layout
        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);

        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);

        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);
        jblobGridPanel.add(label, BorderLayout.CENTER);

        pane.add(jblobGridPanel, BorderLayout.NORTH);
    }
}
