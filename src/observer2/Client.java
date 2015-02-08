package observer2;

import observer.Observer;

public class Client implements Observer {
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		
		System.out.println(" The client say a" + operation
				+ " operation was performed on " + record);
		
	}

}
