package com.eclipsophy.nullcontroller.core.internal.controller;

import java.util.Collections;
import java.util.List;

import com.eclipsophy.nullcontroller.core.data.DemoData;


public class NullController extends AbstractDemoController {

	public List<DemoData> queryMethod() {
		return Collections.emptyList();
	}

	@Override
	public void actionMethod(String name, String value) {
		// TODO Auto-generated method stub
	}



}
