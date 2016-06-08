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

        for (int i = 0; i < 9; i++) {
            ImageIcon image = new ImageIcon("./sf.png");
            JLabel label = new JLabel("", image, JLabel.CENTER);
            label.setSize(50, 50);
            jblobGridPanel.add(label, BorderLayout.CENTER);
        }

        pane.add(jblobGridPanel, BorderLayout.NORTH);
    }
}
