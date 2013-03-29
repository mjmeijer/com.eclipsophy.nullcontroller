package com.eclipsophy.nullcontroller.core.internal.data;

import com.eclipsophy.nullcontroller.core.data.DemoData;


public class DemoDataObject implements DemoData {

	private String name;

	private String value;

	public DemoDataObject(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return getName() + "=" + getValue();
	}

}
