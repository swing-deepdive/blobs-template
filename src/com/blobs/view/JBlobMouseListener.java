package com.blobs.view;

import com.sun.org.apache.xpath.internal.SourceTree;

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
        handleClick();
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

    private void handleClick() {
        switch (jBlob.getBlobState()) {
            case GOOD_BLOB:
                return;
            case BAD_BLOB:
                return;
            default:
                return;

        }
    }
}
