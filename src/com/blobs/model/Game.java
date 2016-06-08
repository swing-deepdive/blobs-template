package com.blobs.model;
import java.util.Timer;

public class Game {
	
	private Timer spawnTimer;
	private Timer gameTimer;
	private Gamefield field;
	
	public Game() {
		
		this.field = new Gamefield(3,3);
		this.gameTimer = new Timer();
		this.spawnTimer = new Timer();
	}
	
	public void start() {
		this.gameTimer.scheduleAtFixedRate(new CheckGameTask(this.field), 50, 50);
		this.spawnTimer.schedule(new NewBlobTask(this.spawnTimer, 2000), 2000);
	}

	private void reset() {
		
	}
	
	public void restart() {
		this.reset();
		this.start();
	}
	
	public void killBlob(int id) {
		this.field.removeBlob(id);
	}
	
}
