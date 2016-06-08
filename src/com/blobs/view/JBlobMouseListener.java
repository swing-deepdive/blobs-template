package com.blobs.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by root on 08.06.16.
 */
public class JBlobMouseListener implements MouseListener {
    private JBlob jBlob;

    public JBlobMouseListener(JBlob jBlob) {
        this.jBlob = jBlob;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO connect to le controlleur
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }
}
