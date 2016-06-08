package com.blobs.model;

import java.util.Date;

public abstract class Blob {
	
	private int id;
	private int score;
	private Date creation;
	private int lifetime;
	
	
	public Blob(int id, int score, int lifetime) {
		this.id = id;
		this.score = score;
		this.creation = new Date();
		this.lifetime = lifetime;
	}
	
	public int getId() {
		return this.id;
	}
	
	public boolean isAlive() 
	{	
		return new Date().getTime() - this.creation.getTime() < this.lifetime;
	}
	
	public int getScore() {
		return score;
	}
}
