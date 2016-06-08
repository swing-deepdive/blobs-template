package com.blobs.model;

import java.util.TimerTask;

public class CheckGameTask extends TimerTask {

	private Gamefield field;
	private Game game;
	
	public CheckGameTask(Game game, Gamefield field) {
		this.field = field;
		this.game = game;
	}
	
	@Override
	public void run() {
        if (!this.field.checkBlobsAlive()) {
			this.game.gameOver();
		}
    }

}
