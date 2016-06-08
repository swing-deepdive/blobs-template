package com.blobs.controller;

import com.blobs.model.Blob;

public interface IController {
	
	public void killBlob(Blob blob);
	
	public void submitHighscore(String name, int score);
	
	public void startGame();
	
	public void restartGame();
}
