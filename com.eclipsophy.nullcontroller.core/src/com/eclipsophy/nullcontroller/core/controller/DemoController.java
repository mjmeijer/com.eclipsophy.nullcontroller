package com.eclipsophy.nullcontroller.core.controller;

import java.util.List;

import com.eclipsophy.nullcontroller.core.data.DemoData;

public interface DemoController {

	public void subscribe(DemoListener listener);

	public void unsubscribe(DemoListener listener);

	abstract void actionMethod(String name, String value);

	abstract List<DemoData> queryMethod();
}
