package com.blobs.view.animation;

import com.blobs.view.JBlob;

/**
 * Created by root on 07.06.16.
 */
public class MoveAnimation extends Animation {
    private int xStep;
    private int yStep;

    public MoveAnimation(JBlob jBlob, int xTarget, int yTarget, int updateDuration) {
        super(jBlob, updateDuration);

        // Calculate the x and y translations for each step
        xStep = (int) Math.round(xTarget * ((double) currentStep / totalSteps));
        yStep = (int) Math.round(yTarget * ((double) currentStep / totalSteps));
    }

    @Override
    public void animateNext() {
        // Remove the current animation
        if (currentStep >= totalSteps) {
            AnimationManager.getInstance().removeAnimation(this);
            return;
        }

        int currentX = (int) getJBlob().getLocation().getX();
        int currentY = (int)  getJBlob().getLocation().getY();
        int width = getJBlob().getShapeWidth();
        int height = getJBlob().getShapeHeight();

        getJBlob().setLocation(currentX + xStep, currentY + yStep);

//        getJBlob().getGraphics().clearRect(currentX, currentY, width + 10, height + 10);
//        getJBlob().getGraphics().drawOval(currentX + xStep, currentX + yStep, width, height);

        currentStep++;
    }
}
