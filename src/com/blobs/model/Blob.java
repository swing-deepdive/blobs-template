package com.blobs.model;

import com.blobs.Constants;

import java.util.Date;

/**
 * The blob is the "piece" or the "Spielfigur" in german of the game. It is created and
 * deleted after a set time, which you can all configure in the {@link Constants} class.
 */
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
