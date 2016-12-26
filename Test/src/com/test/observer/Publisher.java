package com.test.observer;

import com.test.observer.Observer;

public interface Publisher {
	public void addObserver(Observer observer);
	public void notifyObserver();
	public void changeValue(String title, String news);
}
