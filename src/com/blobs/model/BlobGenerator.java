package com.blobs.model;

import com.blobs.Constants;

public class BlobGenerator {
	
	private static BlobGenerator instance;
	
	private BlobGenerator() {
	}
	
	public static BlobGenerator getInstance() {
		if (instance == null) {
			instance = new BlobGenerator();
		}
		return instance;
	}
	
	public Blob generateBlob(int location) {
		return new StandardBlob(location, Constants.BLOB_SCORE, Constants.LIFETIME);
    }
}
