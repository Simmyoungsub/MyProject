package com.test.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mediator m = new Mediator();
		
		A a = new A(m);
        B b = new B(m);
        C c = new C(m);
        
        //a에게 action을 취한다.
        a.fireEvent("ReceiveMail");
	}

}
