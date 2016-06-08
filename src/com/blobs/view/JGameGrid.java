package com.blobs.view;

import com.blobs.model.Blob;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 08.06.16.
 */
public class JGameGrid extends GridLayout {
    private List<JBlob> jBlobList;

    public JGameGrid(int rows, int cols) {
        super(rows, cols);
        this.jBlobList = new ArrayList<>();
    }

    public JPanel init(Blob[] blob) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 900, 600);

        panel.setBackground(new Color(44, 165, 124));

        panel.setLayout(this);

        for (int i = 0; i < 9; i++) {
            JBlob jBlob = new JStandardBlob(blob[i]);
            jBlob.hideBlob();
            panel.add(jBlob, BorderLayout.CENTER);
            jBlobList.add(jBlob);
        }

        return panel;
    }

    public void showSlot(Blob blob) {
        JBlob jblob = jBlobList.get(blob.getId());
        jblob.showBlob(blob);
    }

    public void hideSlot(Blob blob) {
        JBlob jblob = jBlobList.get(blob.getId());
        jblob.hideBlob();
    }
}
