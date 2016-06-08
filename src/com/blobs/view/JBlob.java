package com.blobs.view;

import com.blobs.model.Blob;

import javax.swing.*;
import java.io.File;

public abstract class JBlob extends JLabel {
    private static final String IMG_PATH = "img" + File.separator;
    private Blob blob;

    public JBlob(Blob blob) {
        super("", new ImageIcon(""), JLabel.CENTER);
        showBlob();
        this.blob = blob;

        this.addMouseListener(new JBlobMouseListener(this));
    }

    public Blob getBlob() {
        return blob;
    }

    public void showBlob() {
        setVisible(true);
        int random = (int) (Math.random() * 8.0) + 1;
        setIcon(new ImageIcon(IMG_PATH + "monster" + random + ".png"));
    }

    public void hideBlob() {
        setVisible(false);
    }
}
