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
            JBlob jBlob = new JStandardBlob("sf.png", i);
            jblobGridPanel.add(jBlob, BorderLayout.CENTER);
        }

        pane.add(jblobGridPanel, BorderLayout.NORTH);
    }
}
