package observer2;

import observer2.Observer;

public class Archiver implements Observer {

	public Archiver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub

		System.out.println(" The archiver say a" + operation
				+ " operation was performed on " + record);

	}

}
