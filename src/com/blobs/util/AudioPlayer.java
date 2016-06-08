package com.blobs.util;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by root on 08.06.16.
 */
public class AudioPlayer implements Runnable {
    private String sound;
    private int cycleCount;

    public void playSound(String sound, int cycleCount) {
        this.sound = sound;
        this.cycleCount = cycleCount;

        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer(new Media(new File(sound).toURI().toURL().toString()));
            mediaPlayer.play();
            mediaPlayer.setCycleCount(cycleCount);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
