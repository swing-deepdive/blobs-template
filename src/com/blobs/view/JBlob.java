package com.blobs.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public abstract class JBlob extends JLabel {
    private static final String IMG_PATH = "img" + File.separator;

    private int locationID;
    private BlobState blobState;

    public JBlob(String imagePath, int locationID, BlobState blobState) {
        super("", new ImageIcon(imagePath), JLabel.CENTER);
        this.locationID = locationID;

        this.addMouseListener(new JBlobMouseListener(this));
    }

    public int getLocationID() {
        return locationID;
    }

    public BlobState getBlobState() {
        return blobState;
    }

    public void update() {
        int random = (int) (Math.random() * 8.0) + 1;

        setIcon(new ImageIcon(IMG_PATH + "monster" + random + ".png"));

        if (random % 2 == 0) {
            blobState = BlobState.GOOD_BLOB;
        } else {
            blobState = BlobState.BAD_BLOB;
        }
    }
}
