package singleton;

public class TestSingletonThreaded implements Runnable {

	Thread thread;

	public static void main(String[] args) {
		TestSingletonThreaded t = new TestSingletonThreaded();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatabaseThreaded database;
		database = DatabaseThreaded.getInstance("employee");
		
		System.out.println("This is the " + database.getName() + " database ");

	}

	public TestSingletonThreaded() {
		// TODO Auto-generated constructor stub
		DatabaseThreaded database;
		database = DatabaseThreaded.getInstance("product");
		thread = new Thread(this, "seconds");
		thread.start();

		System.out.println("This is the " + database.getName() + " database ");
	}

}
