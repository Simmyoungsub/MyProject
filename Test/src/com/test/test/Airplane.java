package com.test.test;

public class Airplane extends Thread implements IAirplane {
	private final ControllTower tower;
	private final int seq;
	
	public Airplane(InMediator tower, int seq){
		this.tower = (ControllTower)tower;
		this.seq = seq;
	}
	
	public int getSeq(){
		return this.seq;
	}
	
	@Override
	public void run(){
		try{
			while(!tower.getPermission()){
				System.out.println(seq + "번째 비행기 대기중");
				Thread.sleep(10L);
			}
			
			tower.land(this);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
