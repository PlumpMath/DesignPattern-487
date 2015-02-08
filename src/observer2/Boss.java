package observer2;

import observer.Observer;

public class Boss implements Observer {
	
	public Boss() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		
		System.out.println(" The boss say a" + operation
				+ " operation was performed on " + record);
		
	}

}
