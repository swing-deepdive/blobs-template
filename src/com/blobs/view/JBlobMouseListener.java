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
    private JBlob jBlob;
    private IController controller;
    private AudioPlayer audioPlayer;

    public JBlobMouseListener(JBlob jBlob, IController controller) {
        this.jBlob = jBlob;
        this.controller = controller;
        this.audioPlayer = new AudioPlayer();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        audioPlayer.playSound("audio" + File.separator + "kill.wav", 800);
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
