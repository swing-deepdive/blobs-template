package com.blobs.model;

import java.util.TimerTask;

public class CheckGameTask extends TimerTask {

	Gamefield field;
	Game game;
	
	public CheckGameTask(Game game, Gamefield field) {
		this.field = field;
		this.game = game;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (!this.field.checkBlobsAlive()) {
			this.game.
		}
	}

}
