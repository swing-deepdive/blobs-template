package com.blobs.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 08.06.16.
 */
public class JBlobGrid extends GridLayout {
    private List<JBlob> jBlobList;

    public JBlobGrid(int rows, int cols) {
        super(rows, cols);

        jBlobList = new ArrayList<>();
    }

    public void init(Container pane) {
        final JPanel jblobGridPanel = new JPanel();
        jblobGridPanel.setLayout(this);

        for (int i = 0; i < 9; i++) {
            JBlob jBlob = new JStandardBlob("sf.png", i, BlobState.GOOD_BLOB);
            jblobGridPanel.add(jBlob, BorderLayout.CENTER);
            jBlobList.add(jBlob);
        }

        pane.add(jblobGridPanel, BorderLayout.NORTH);
    }

    public void updateSlot(int index, JBlob jBlob) {
        JBlob blob = jBlobList.get(index);
    }
}
