package com.eclipsophy.nullcontroller.core.internal.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.eclipsophy.nullcontroller.core.data.DemoData;
import com.eclipsophy.nullcontroller.core.internal.data.DemoDataObject;

public class StubController extends AbstractDemoController {

	private static DemoData[] temp = { new DemoDataObject("test", "value") };

	private static List<DemoData> initial = Arrays.asList(temp);


	public List<DemoData> queryMethod() {
		// TODO Auto-generated method stub
		return Collections.unmodifiableList(initial);
	}

	@Override
	public void actionMethod(String name, String value) {
		// TODO Auto-generated method stub

	}

}
