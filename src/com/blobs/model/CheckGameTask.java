package com.blobs.model;

import java.util.TimerTask;

public class CheckGameTask extends TimerTask {

	Gamefield field;
	
	public CheckGameTask(Gamefield field) {
		this.field = field;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (!this.field.checkBlobsAlive()) {
			// end game
		}
	}

}
