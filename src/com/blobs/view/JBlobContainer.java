package com.blobs.view;

import com.blobs.MVC;
import com.blobs.controller.IController;
import com.blobs.model.Blob;

import javax.swing.*;
import java.io.File;

public abstract class JBlobContainer extends JLabel {
    private static final String IMG_PATH = "img" + File.separator;
    private Blob blob;

    public JBlobContainer(Blob blob) {
        super("", new ImageIcon(IMG_PATH + "background.png"), JLabel.CENTER);
        showBlob(blob);

        this.addMouseListener(new JBlobMouseListener(this, MVC.getController()));
    }

    public Blob getBlob() {
        return blob;
    }

    public boolean isEmpty() {
        return blob == null;
    }

    public void showBlob(Blob blob) {
        this.blob = blob;
        setVisible(true);
        int random = (int) (Math.random() * 8.0) + 1;
        setIcon(new ImageIcon(IMG_PATH + "monster" + random + ".png"));
    }

    public void hideBlob() {
        blob = null;
        setVisible(false);
    }
}
