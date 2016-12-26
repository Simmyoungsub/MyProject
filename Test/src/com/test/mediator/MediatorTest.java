package com.test.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
        B b = new B();
        C c = new C();

        Mediator m = new Mediator();
        m.addColleague(a);
        m.addColleague(b);
        m.addColleague(c);

        //m.sendEvent("B", "Hello");
        a.fireEvent("ReceiveMail");
	}

}
