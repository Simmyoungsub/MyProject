
public class MediatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator m = new Mediator();
		
		A a = new A();
		B b = new B();
		a.dO(m);
		b.dO(m);
	}

}
