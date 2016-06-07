package com.blobs.view.animation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 08.06.16.
 */
class UpdateAnimationListener implements ActionListener {
    private Set<Animation> animations;

    UpdateAnimationListener() {
        this.animations = Collections.newSetFromMap(new ConcurrentHashMap<Animation, Boolean>());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Animation animation : animations) {
            animation.animateNext();
        }
    }

    void addAnimation(Animation animation) {
        animations.add(animation);
    }

    void removeAnimation(Animation animation) {
        animations.remove(animation);
    }
}
