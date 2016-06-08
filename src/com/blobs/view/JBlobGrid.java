package com.blobs.view;

import com.blobs.model.Blob;

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
        jblobGridPanel.setBackground(new Color(44, 165, 124));

        jblobGridPanel.setLayout(this);

        for (int i = 0; i < 9; i++) {
            JBlob jBlob = new JNullBlob();
            jblobGridPanel.add(jBlob, BorderLayout.CENTER);
            jBlobList.add(jBlob);
        }

        pane.add(jblobGridPanel, BorderLayout.NORTH);
    }

    public void showSlot(Blob blob) {
        JBlob jblob = jBlobList.get(blob.getId());
        jblob.hideBlob();
    }

    public void hideSlot(Blob blob) {
        JBlob jblob = jBlobList.get(blob.getId());
        jblob.hideBlob();
    }
}
