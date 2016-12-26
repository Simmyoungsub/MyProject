package com.test.mediator;

public class C extends Colleague {

	String name = "C";
	
	@Override
	public void fireEvent(String event) {
		// TODO Auto-generated method stub
		 mediator.sendEvent(name, event);
	}

	@Override
	public void receiveEvent(String name, String event) {
		// TODO Auto-generated method stub
		System.out.println("Receive event from " + name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
