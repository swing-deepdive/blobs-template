package com.blobs.util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by root on 08.06.16.
 */
public class AudioPlayer implements Runnable {
    private String sound;
    private long duration;

    public void playSound(String sound, long duration) {
        this.sound = sound;
        this.duration = duration;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        Clip clip = null;
        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sound).getAbsoluteFile())) {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            Thread.sleep(duration);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        } finally {
            if (clip != null) {
                clip.close();
            }
        }
    }
}
