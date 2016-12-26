package com.test.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
	private List<Colleague> colleagues = new ArrayList<Colleague>();
	
	 public Mediator() {
    
	 }
	
	 public void addColleague(Colleague a) {
         a.setMediator(this);
         colleagues.add(a);
	 }
	 
	@Override
	public void sendEvent(String name, String event) {
		// TODO Auto-generated method stub
		for (Colleague s : colleagues) {
            if (s.getName() == name) {
                    s.receiveEvent(name, event);
            }
		}
	}

}
