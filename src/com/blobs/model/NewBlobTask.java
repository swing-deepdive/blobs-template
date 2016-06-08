package com.blobs.model;

import java.util.TimerTask;
import java.util.Timer;

public class NewBlobTask extends TimerTask {

	Timer timer;
	int time;
	Game game;
		
	public NewBlobTask(Game game, Timer timer, int time) {
		this.game = game;
		this.timer = timer;
		this.time = time;
	}
	
	@Override
	public void run() {
		this.game.addBlob();
		timer.schedule(new NewBlobTask(this.game, this.timer, (int) (time * 0.95)), (int) (time * 0.8));
	}

}
