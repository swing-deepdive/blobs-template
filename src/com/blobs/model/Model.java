package com.blobs.model;

import com.blobs.view.View;

public class Model implements IModel {

	private View view;
	private Game game;
	
	public Model(View view) {
		this.view = view;
		this.game = new Game();
	}
	
	@Override
	public void startGame() {
		game.start();
	}

	@Override
	public void restartGame() {
		game.restart();
	}

	@Override
	public void killBlob(int id) {
		game.killBlob(id);
	}

}
