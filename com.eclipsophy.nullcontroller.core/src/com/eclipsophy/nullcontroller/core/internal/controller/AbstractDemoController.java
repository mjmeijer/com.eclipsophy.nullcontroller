package com.eclipsophy.nullcontroller.core.internal.controller;

import com.eclipsophy.nullcontroller.core.controller.DemoController;
import com.eclipsophy.nullcontroller.core.controller.DemoListener;

public abstract class AbstractDemoController implements DemoController {

	public void subscribe(DemoListener listener) {
		// TODO Auto-generated method stub

	}

	public void unsubscribe(DemoListener listener) {
		// TODO Auto-generated method stub

	}

	public abstract void actionMethod(String name, String value);

}
