package com.test.test;

public class AirplaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InMediator tower = new ControllTower();
		
		for(int i=1;i<=10;i++){
			Airplane air = new Airplane(tower, i);
			air.start();
		}
	}

}
