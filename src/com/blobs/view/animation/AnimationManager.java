package com.blobs.view.animation;

import javax.swing.Timer;

/**
 * Created by root on 07.06.16.
 */
public class AnimationManager {
    private static AnimationManager animationManager = null;

    private ActionUpdateAnimationListener animationListener;
    private int updateFrequency;

    public static AnimationManager getInstance(int updateFrequency) {
        if (animationManager == null) {
            animationManager = new AnimationManager(updateFrequency);
            return animationManager;
        }

        return animationManager;
    }

    public static AnimationManager getInstance() {
        return animationManager;
    }

    private AnimationManager(int updateFrequency) {
        this.updateFrequency = updateFrequency;
        animationListener = new ActionUpdateAnimationListener();
        Timer animationTimer = new Timer(updateFrequency, animationListener);

        animationTimer.start();
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public void addAnimation(Animation animation) {
        animationListener.addAnimation(animation);
    }

    public void removeAnimation(Animation animation) {
        animationListener.removeAnimation(animation);
    }
 }
