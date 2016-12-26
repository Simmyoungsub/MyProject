package com.test.observer;

import java.util.ArrayList;

import com.test.observer.Observer;

public class NewMachine implements Publisher {
	
	private ArrayList<Observer> observers;
	private String title;
	private String news;
	
	public NewMachine(){
		observers = new ArrayList<Observer>();
	}
	
	public void changeValue(String title, String news){
		this.title = title;
		this.news = news;
		this.notifyObserver();
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObserver() {
		for(Observer ob : observers){
			ob.update(this.title, this.news);
		}
	}

}
