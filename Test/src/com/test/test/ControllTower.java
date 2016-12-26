package com.test.test;

public class ControllTower implements InMediator  {

	private boolean InUse = false;
	
	@Override
	public synchronized boolean getPermission() {
		// TODO Auto-generated method stub
		
		if(InUse){
			return false;
		}else{
			InUse = true;
			return true;
		}
	}

	@Override
	public void land(IAirplane airplane) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Airplane air = (Airplane)airplane;
		
		System.out.println(air.getSeq()+"번째 비행기 착륙시작");
		Thread.sleep(50L);
		System.out.println(air.getSeq()+"번째 비행기 착륙완료");
		this.InUse = false;
	}

}
