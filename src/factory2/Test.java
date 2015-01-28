package factory2;

public class Test {

	public static void main(String[] args) {

		float salary = 2000f;

		MoneyManagement manager = ManagementFactory.getInstance(salary);
		manager.showMessenge(salary);
	}

}
