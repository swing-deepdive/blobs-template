package com.blobs.model;

import com.blobs.view.BlobState;
import com.blobs.view.JBlob;
import com.blobs.view.JStandardBlob;

public class StandardBlob extends Blob {

	public StandardBlob(int id, int score, int lifetime) {
		super(id, score, lifetime);
		// TODO Auto-generated constructor stub
	}

	@Override
	JBlob getJBlob() {
		// TODO Auto-generated method stub
		return new JStandardBlob("sdf", 3, BlobState.BAD_BLOB);
	}

}
