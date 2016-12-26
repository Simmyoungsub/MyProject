package com.test.observer;

import java.util.ArrayList;
import com.test.observer.Observer;

public class NewMachine implements Publisher {
	
	private ArrayList<Observer> observers;
	private String title;
	private String news;
	
	public NewMachine(){
		observers = new ArrayList<Observer>();
		this.title = "hello";
		this.news = "good";
	}
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob : observers){
			ob.update(this.title, this.news);
		}
	}

}
