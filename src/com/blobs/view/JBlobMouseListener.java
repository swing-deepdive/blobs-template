package com.blobs.view;

import com.blobs.controller.IController;
import com.blobs.util.AudioPlayer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

/**
 * Created by root on 08.06.16.
 */
public class JBlobMouseListener implements MouseListener {
    private JBlobContainer jBlobContainer;
    private IController controller;
    private AudioPlayer audioPlayer;

    public JBlobMouseListener(JBlobContainer jBlobContainer, IController controller) {
        this.jBlobContainer = jBlobContainer;
        this.controller = controller;
        this.audioPlayer = new AudioPlayer();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!jBlobContainer.isEmpty()) {
            audioPlayer.playSound("audio" + File.separator + "kill.wav", 1);
            controller.killBlob(jBlobContainer.getBlob());
        }
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
