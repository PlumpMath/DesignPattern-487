package observer1;

public class Test {

	public static void main(String[] args) {

		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();

		Product product1 = new Product();
		
		product1.attach(o1);
		product1.attach(o2);
		product1.attach(o3);
		
		product1.notifycation();
	}

}
