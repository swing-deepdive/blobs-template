package com.blobs.controller;

import com.blobs.model.Blob;

public interface IController {
	
	public void killBlob(Blob blob);
	
	public void submitHighscore(String name);
	
	public void startGame();
	
	public void restartGame();
}
