package com.test.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publisher publisher = new NewMachine();
		AnnualSubScriber as = new AnnualSubScriber(publisher);
		ColdSubScriber cs = new ColdSubScriber(publisher);
		
		publisher.changeValue("Today", "Hello everyone");
	}
	
}
