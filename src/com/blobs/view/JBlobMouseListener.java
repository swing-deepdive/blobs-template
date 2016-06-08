package com.blobs.view;

import com.blobs.controller.IController;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by root on 08.06.16.
 */
public class JBlobMouseListener implements MouseListener {
    private JBlob jBlob;
    private IController controller;

    public JBlobMouseListener(JBlob jBlob, IController controller) {
        this.jBlob = jBlob;
        this.controller = controller;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        controller.killBlob(jBlob.getBlob());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
