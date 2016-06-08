package com.blobs.model;
import java.util.Timer;

import com.blobs.view.IView;

public class Game implements IModel{
	
	private Timer spawnTimer;
	private Timer gameTimer;
	private Gamefield field;
	private int score;
	private IView view;
	
	public Game(IView view) {
		this.view = view;
		reset();
	}
	
	private void reset() {
		this.field = new Gamefield(3,3);
		this.gameTimer = new Timer();
		this.spawnTimer = new Timer();
		this.score = 0;
	}
	
	public void killBlob(int id) {
		
		this.field.removeBlob(id);
	}
	
	public void gameOver() {
		
	}

	@Override
	public void startGame() {
		this.gameTimer.scheduleAtFixedRate(new CheckGameTask(this, this.field), 50, 50);
		this.spawnTimer.schedule(new NewBlobTask(this.spawnTimer, 2000), 2000);
		
	}

	@Override
	public void restartGame() {
		this.reset();
		this.startGame();
	}

	@Override
	public void submitHighscore(String name, int score) {
		// TODO Auto-generated method stub
		
	}
}
