package com.bazaarvoice.maven.plugins.s3.upload;

import java.io.Serializable;

public class Metadata implements Serializable {

	private static final long serialVersionUID = -8143541798166470995L;
	
	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
