package com.blobs.model;

import java.util.Random;

public class Gamefield {

	private Blob[] blobs;
	private int width;
	private int height;
	private static Random random = new Random();

	public Gamefield(int width, int height) {
		this.width = width;
		this.height = height;
		blobs = new Blob[width * height];
	}
	
	public int getBlobScore(int location) {
		if (blobs[location] != null) {
			return blobs[location].getScore();
		}
		return 0;
	}

	public int addBlob() {
		int location;
		do {
			location = random.nextInt(9);
		} while (blobs[location] != null);
		blobs[location] = BlobGenerator.getInstance().generateBlob(location);
		System.out.println("added new blob at " + Integer.toString(location));
		return location;
	}

	public void removeBlob(int location) {
		blobs[location] = null;
	}
	
	public boolean checkBlobsAlive() {
		for (Blob blob : blobs) {
			if (blob == null) {
				continue;
			}
			if (!blob.isAlive()) {
				return false;
			}
		}
		return true;
	}

}
