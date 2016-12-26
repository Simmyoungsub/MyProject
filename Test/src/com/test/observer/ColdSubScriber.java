package com.test.observer;

public class ColdSubScriber implements Observer {
	
	private Publisher publisher;
	private String title;
	private String news;
	
	public ColdSubScriber(Publisher publisher){
		this.publisher = publisher;
		publisher.addObserver(this);
	}
	
	public void update(String title, String news) {
		// TODO Auto-generated method stub
		
		this.title = title;
		this.news = news;
		System.out.println("Update ColdSubScriber");
		System.out.println("title : "+title+", news : "+news);
		
	}

}
