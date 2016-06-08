package com.blobs.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public abstract class JBlob extends JLabel {
    private static final String IMG_PATH = "img" + File.separator;
    private int locationID;

    public JBlob(String imagePath, int locationID) {
        super("", new ImageIcon(imagePath), JLabel.CENTER);
        this.locationID = locationID;

        this.addMouseListener(new JBlobMouseListener(this));
    }

    public int getLocationID() {
        return locationID;
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
