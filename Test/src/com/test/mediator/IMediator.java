package com.test.mediator;

public interface IMediator {
	public void sendEvent(String name, String event);
	public void addColleague(Colleague colleague);
}
