package observer1;

import java.util.Vector;

public class Product implements Subject {

	private Vector<Observer> observer = new Vector<Observer>();

	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attach(Observer obsever) {
		// TODO Auto-generated method stub
		observer.add(obsever);
	}

	@Override
	public void detach(Observer obsever) {
		// TODO Auto-generated method stub
		observer.remove(obsever);
	}

	@Override
	public void notifycation() {
		// TODO Auto-generated method stub
		for (Observer o : observer) {
			o.update();
		}
	}

}
