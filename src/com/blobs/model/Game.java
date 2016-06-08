package com.blobs.model;

import java.util.Timer;

import com.blobs.Constants;
import com.blobs.view.IView;

public class Game implements IModel {

	private Timer spawnTimer;
	private Timer gameTimer;
	private Gamefield field;
	private int score;
	private IView view;
	private RankingManager manager;

	public Game(IView view) {
		this.view = view;
		this.manager = new RankingManager();
		reset();
	}

	private void reset() {
		this.field = new Gamefield(Constants.GAMEFIELD_WIDTH, Constants.GAMEFIELD_HEIGHT);
		this.gameTimer = new Timer();
		this.spawnTimer = new Timer();
		this.score = Constants.BLOB_SCORE;
	}

	public void killBlob(Blob blob) {
		this.score += blob.getScore();
		this.field.removeBlob(blob.getId());
		this.view.removeBlob(blob);
		this.view.updateScore(this.score);
	}

	public void gameOver() {
		this.gameTimer.cancel();
		this.spawnTimer.cancel();
		this.view.gameOver();
	}

	public void addBlob() {
		Blob blob = this.field.addBlob();
		this.view.addBlob(blob);
	}

	@Override
	public void startGame() {
		this.view.gameStarted();
		this.gameTimer.scheduleAtFixedRate(new CheckGameTask(this, this.field), 50, 50);
		this.spawnTimer.schedule(new NewBlobTask(this, this.spawnTimer, Constants.SPAWN_DELAY), Constants.SPAWN_DELAY);
	}

	@Override
	public void restartGame() {
		this.reset();
		this.startGame();
	}

	@Override
	public void submitHighscore(String name) {
		this.manager.addRanking(new Ranking(name, this.score));
		this.view.showLeaderboards(this.manager.getRankings());
	}
}
