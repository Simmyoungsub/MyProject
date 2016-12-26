package com.test.observer;

public class AnnualSubScriber implements Observer {
	
	private Publisher publisher;
	
	public AnnualSubScriber(Publisher publisher){
		this.publisher = publisher;
		publisher.addObserver(this);
	}
	
	@Override
	public void update(String title, String news) {
		// TODO Auto-generated method stub
		System.out.println("title : "+title+", news : "+news);
	}

}
