package com.blobs.model;

import java.util.Date;

import com.blobs.view.JBlob;

public abstract class Blob {
	
	abstract JBlob getJBlob();
	
	private int id;
	private int x;
	private int y;
	private Date creation;
	private int lifetime;
	
	
	public Blob(int id, int lifetime) {
		this.id = id;
		this.creation = new Date();
		this.lifetime = lifetime;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isAlive() {
		return this.creation.getTime() - new Date().getTime() < this.lifetime;
	}
}
