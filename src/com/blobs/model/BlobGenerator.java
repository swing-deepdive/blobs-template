package com.blobs.model;

import java.util.Random;
import java.util.regex.Matcher;

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
		int score = (int) (Math.random() * 5.0) + 1;
		return new StandardBlob(location, score, 3000);
    }
}
