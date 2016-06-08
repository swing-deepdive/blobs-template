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
    private List<JBlobContainer> jBlobContainerList;

    public JGameGrid(int rows, int cols) {
        super(rows, cols);
        this.jBlobContainerList = new ArrayList<>();
    }

    public JPanel init(Blob[] blob) {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 900, 600);

        panel.setBackground(new Color(44, 165, 124));

        panel.setLayout(this);

        for (int i = 0; i < 9; i++) {
            JBlobContainer jBlobContainer = new JStandardBlobContainer(blob[i]);
            jBlobContainer.hideBlob();
            panel.add(jBlobContainer, BorderLayout.CENTER);
            jBlobContainerList.add(jBlobContainer);
        }

        return panel;
    }

    public void showSlot(Blob blob) {
        JBlobContainer jblob = jBlobContainerList.get(blob.getId());
        jblob.showBlob(blob);
    }

    public void hideSlot(Blob blob) {
        JBlobContainer jblob = jBlobContainerList.get(blob.getId());
        jblob.hideBlob();
    }
}
