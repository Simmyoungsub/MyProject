package com.test.mediator;

public class A extends Colleague {
	private IMediator mediator;
	private String name = "A";
	
	public A(IMediator mediator){
		this.mediator = mediator;
		mediator.addColleague(this);
	}
	
	@Override
	public void fireEvent(String event) {
		// TODO Auto-generated method stub
		 mediator.sendEvent(name, event);
	}

	@Override
	public void receiveEvent(String name, String event) {
		// TODO Auto-generated method stub
		System.out.println("A : Receive event from " + name);
		System.out.println("Event : " + event);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
