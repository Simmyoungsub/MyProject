package com.test.test;

public interface InMediator {
	public boolean getPermission();
	public void land(IAirplane airplane) throws InterruptedException;
}
