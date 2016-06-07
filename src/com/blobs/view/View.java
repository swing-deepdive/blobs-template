package com.blobs.view;

import com.blobs.view.animation.Animation;
import com.blobs.view.animation.AnimationManager;
import com.blobs.view.animation.MoveAnimation;

import javax.swing.JFrame;

public class View extends JFrame implements IView {

	public View() {
		this.setSize(900, 700);
		this.setVisible(true);

        AnimationManager animationManager = AnimationManager.getInstance(50);
        JBlob jBlob = new JStandardBlob(40, 40, 60, 60);
        Animation animation = new MoveAnimation(jBlob, 160, 160, 10000);
        this.add(jBlob);

        animationManager.addAnimation(animation);
	}
}
