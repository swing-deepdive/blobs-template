package com.blobs.model;

import com.blobs.view.JBlob;
import com.blobs.view.JStandardBlob;

public class StandardBlob extends Blob {

	public StandardBlob(int id, int lifetime) {
		super(id, lifetime);
		// TODO Auto-generated constructor stub
	}

	@Override
	JBlob getJBlob() {
		// TODO Auto-generated method stub
		return new JStandardBlob(40, 40, 60, 60);
	}

}
