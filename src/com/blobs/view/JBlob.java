package com.blobs.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class JBlob extends JLabel {
    private int locationID;
    private ImageIcon image;
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
}
