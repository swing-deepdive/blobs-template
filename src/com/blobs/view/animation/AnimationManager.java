package com.blobs.view.animation;

import com.blobs.view.JBlob;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.Timer;

/**
 * Created by root on 07.06.16.
 */
public class AnimationManager {
    private static AnimationManager animationManager = null;

    private Set<Animation> animations;
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
        animations = ConcurrentHashMap.newKeySet();
        this.updateFrequency = updateFrequency;
        Timer animationTimer = new Timer(updateFrequency, (actionEvent) -> animate());
        animationTimer.start();
    }

    public int getUpdateFrequency() {
        return updateFrequency;
    }

    public void addAnimation(Animation animation) {
        animations.add(animation);
    }

    public void removeAnimation(Animation animation) {
        animations.remove(animation);
    }

    public void animate() {
        animations.stream().forEach(Animation::animateNext);
    }
 }
