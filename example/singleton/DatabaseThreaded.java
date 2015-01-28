package singleton;

public class DatabaseThreaded {

	private static DatabaseThreaded singleObject = new DatabaseThreaded(
			"product");
	private int record;
	private String name;

	private DatabaseThreaded(String n) {
		// TODO Auto-generated constructor stub
		name = n;
	}

	public static synchronized DatabaseThreaded getInstance(String n) {
		return singleObject;
	}

	public void editrecord(String operation) {
		System.out.println(" Performing a " + operation
				+ " operating on record " + record + " in database " + name);
	}

	public String getName() {
		return name;
	}

}
