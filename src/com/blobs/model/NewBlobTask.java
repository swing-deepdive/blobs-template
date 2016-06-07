package com.blobs.model;

import java.util.TimerTask;
import java.util.Timer;

public class NewBlobTask extends TimerTask {

	Timer timer;
	int time;
		
	public NewBlobTask(Timer timer, int time) {
		this.timer = timer;
		this.time = time;
	}
	
	@Override
	public void run() {
		//
		timer.schedule(new NewBlobTask(this.timer, (int) (time * 0.95)), (int) (time * 0.8));
	}

}
