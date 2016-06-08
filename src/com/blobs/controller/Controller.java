package com.blobs.controller;

import com.blobs.model.IModel;

public class Controller implements IController {

	private IModel model;
	
	public Controller(IModel model) {
		this.model = model;
	}
	
	@Override
	public void killBlob(int location) {
		
		this.model.killBlob(location);
	}

	@Override
	public void submitHighscore(String name, int score) {
		this.model.submitHighscore(name, score);
		
	}

	@Override
	public void startGame() {
		this.model.startGame();
	}

	@Override
	public void restartGame() {
		this.model.restartGame();
	}
	
	
}
