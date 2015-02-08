package observer;

import java.util.Vector;

import observer.Observer;
import observer.Subject;

public class Database implements Subject {

	private Vector<Observer> observers;
	private String operation;
	private String record;

	public Database() {
		// TODO Auto-generated constructor stub

		observers = new Vector<Observer>();

	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {

			Observer observer = (Observer) observers.get(i);
			observer.update(operation, record);

		}
	}

	public void editRecord(String operation, String record) {

		this.operation = operation;
		this.record = record;
		notifyObservers();

	}

}
