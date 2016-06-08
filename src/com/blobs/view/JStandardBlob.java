package com.blobs.view;

import javax.swing.*;
import java.awt.*;

public class JStandardBlob extends JBlob {

    public JStandardBlob(int xLocation, int yLocation, int shapeHeight, int shapeWidth) {
        super(xLocation, yLocation, shapeWidth, shapeHeight);
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawOval(getXLocation(), getYLocation(), getShapeWidth(), getShapeHeight());
    }
}
