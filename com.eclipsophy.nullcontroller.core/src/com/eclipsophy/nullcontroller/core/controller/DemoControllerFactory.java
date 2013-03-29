package com.eclipsophy.nullcontroller.core.controller;

import com.eclipsophy.nullcontroller.core.internal.controller.J2EEController;
import com.eclipsophy.nullcontroller.core.internal.controller.LocalTestController;
import com.eclipsophy.nullcontroller.core.internal.controller.NullController;
import com.eclipsophy.nullcontroller.core.internal.controller.StubController;

public class DemoControllerFactory {

	private static final String CONTROLLER = "demo.controller";

	private DemoControllerFactory() {
		// TODO Auto-generated constructor stub
	}

	public final static DemoController getDemoController() {
		String type = System.getProperty(CONTROLLER);

		if ("null".equals(type)) {
			return new NullController();
		} else if ("stub".equals(type)) {
			return new StubController();
		} else if ("local".equals(type)) {
			return new LocalTestController();
		}
		return new J2EEController();
	}

}
