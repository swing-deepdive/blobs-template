package com.blobs.view.animation;

import com.blobs.view.JBlob;

/**
 * Created by root on 07.06.16.
 */
public abstract class Animation {
    protected JBlob jBlob;
    protected int updateSpeed;
    protected final int totalSteps;
    protected int currentStep;

    public Animation(JBlob jBlob, int updateDuration) {
        this.jBlob = jBlob;
        this.totalSteps = (int) Math.ceil(updateDuration / AnimationManager.getInstance().getUpdateFrequency());
        this.currentStep = 1; // By default we are in step 1
    }

    public JBlob getJBlob() {
        return jBlob;
    }

    public abstract void animateNext();

    @Override
    public boolean equals(Object animation) {
        return animation instanceof Animation && ((Animation) animation).getJBlob().equals(jBlob);
    }
}
