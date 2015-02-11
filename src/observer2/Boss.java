package observer2;

import observer2.Observer;

public class Boss implements Observer {
	
	public Boss() {
		// TODO Auto-generated constructor stub
	}
	
	// Đây là các lớp con cài đặt lại phương thức từ lớp cha
	

	@Override
	public void update(String operation, String record) {
		// TODO Auto-generated method stub
		
		System.out.println(" The boss say a" + operation
				+ " operation was performed on " + record);
		
	}

}
