package com.blobs.model;

public interface IModel {
	
	void startGame();
	
	void restartGame();
	
	void killBlob(Blob blob);
	
	void submitHighscore(String name);
	
}
