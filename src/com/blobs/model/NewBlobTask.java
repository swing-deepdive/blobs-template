package com.blobs.model;

import com.blobs.Constants;

import java.util.TimerTask;
import java.util.Timer;

public class NewBlobTask extends TimerTask {

	private Timer timer;
	private int time;
	private Game game;
		
	public NewBlobTask(Game game, Timer timer, int time) {
		this.game = game;
		this.timer = timer;
		this.time = time;
	}
	
	@Override
	public void run() {
		this.game.addBlob();
		int newTime = (int) (time * Constants.SPAWN_INC);
		TimerTask task = new NewBlobTask(this.game, this.timer, newTime);
		this.timer.schedule(task, newTime);
	}

}
