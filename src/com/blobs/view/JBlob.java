package com.blobs.view;

import com.blobs.view.animation.Animation;

import javax.swing.JPanel;
import java.awt.*;

public abstract class JBlob extends JPanel {
    private int xLocation;
    private int yLocation;
    private int shapeHeight;
    private int shapeWidth;

    public JBlob(int xLocation, int yLocation, int shapeWidth, int shapeHeight) {
        super();

        setSize(shapeWidth * 2, shapeHeight * 2);
        setVisible(true);

        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.shapeHeight = shapeHeight;
        this.shapeWidth = shapeWidth;
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public int getShapeHeight() {
        return shapeHeight;
    }

    public int getShapeWidth() {
        return shapeWidth;
    }

}
