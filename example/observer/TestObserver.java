package observer;

public class TestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();

		database.registerObserver(archiver);
		database.registerObserver(client);
		database.registerObserver(boss);
		database.editRecord("delete", "1");

	}

}
