package com.blobs.controller;

public interface IController {
	public void killBlob(int location);
	
	public void submitHighscore(String name, int score);
	
	public void startGame();
	
	public void restartGame();
}
