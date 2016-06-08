package com.blobs.model;
import java.util.Timer;

import com.blobs.view.IView;
import com.blobs.view.View;

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
	
	public void killBlob(Blob blob) {
		this.score += blob.getScore();
		this.field.removeBlob(blob.getId());
		this.view.hideSlot(blob);
		this.view.updateScore(this.score);
	}
	
	public void gameOver() {
		System.out.println("Game Over");
		this.gameTimer.cancel();
		this.spawnTimer.cancel();
		this.view.gameOver();
	}
	
	public void addBlob() {
		Blob blob = this.field.addBlob();
		this.view.showSlot(blob);
	}

	@Override
	public void startGame() {
		Blob[] nullBlobs = new Blob[this.field.getLength()];
		for (int i = 0; i < this.field.getLength(); i++) {
			nullBlobs[i] = new StandardBlob(i, 0, Integer.MAX_VALUE);
		}
		this.view.gameStarted(nullBlobs);
		this.gameTimer.scheduleAtFixedRate(new CheckGameTask(this, this.field), 50, 50);
		this.spawnTimer.schedule(new NewBlobTask(this, this.spawnTimer, 2000), 2000);
	}

	@Override
	public void restartGame() {
		this.reset();
		this.startGame();
	}

	@Override
	public void submitHighscore(String name, int score) {
		// Network
		this.view.highscoreSubmitted(score, name);
	}
}
