package com.test.observer;

public class ColdSubScriber implements Observer {
	
	private Publisher publisher;
	
	public ColdSubScriber(Publisher publisher){
		this.publisher = publisher;
		publisher.addObserver(this);
	}
	
	@Override
	public void update(String title, String news) {
		// TODO Auto-generated method stub

	}

}
