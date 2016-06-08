package com.blobs.model;

import java.util.Date;

import com.blobs.view.JBlob;

public abstract class Blob {
	
	abstract JBlob getJBlob();
	
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
	
	public boolean isAlive() {
		return this.creation.getTime() - new Date().getTime() < this.lifetime;
	}
	
	public int getScore() {
		return score;
	}
}
