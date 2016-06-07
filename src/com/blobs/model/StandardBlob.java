package com.blobs.model;

import com.blobs.view.JBlob;
import com.blobs.view.JStandardBlob;

public class StandardBlob extends Blob {

	@Override
	JBlob getJBlob() {
		// TODO Auto-generated method stub
		return new JStandardBlob();
	}

}
