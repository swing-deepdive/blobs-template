package com.blobs.model;

import java.util.Random;

public class BlobGenerator {
	
	private static BlobGenerator instance;
	private static Random random;
	
	private BlobGenerator() {
		random = new Random();
	}
	
	public static BlobGenerator getInstance() {
		if (instance == null) {
			instance = new BlobGenerator();
		}
		return instance;
	}
	
	public Blob generateBlob(int location) {
		
		Blob blob = new StandardBlob(location, random.nextInt(3) + 2, 3000);
		
		return blob;
	}
}
