package com.test.mediator;

public class B extends Colleague {

String name = "B";
	
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
