package com.blobs.model;

import java.util.ArrayList;
import java.util.List;

public class Gamefield {
	
	private List<Blob> blobs;
	private int width;
	private int height;
	
	public Gamefield(int width, int height) {
		this.width = width;
		this.height = height;
		blobs = new ArrayList<Blob>();
	}
	
	public void addBlob(Blob blob) {
		blobs.add(blob);
	}
	
	public void removeBlob(int id) {
		for (Blob blob : blobs) {
			if (blob.getId() == id) {
				blobs.remove(blob);
			}
		}
	}
	
}
