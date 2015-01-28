package factory2;

public class MoneyManagement {

	private String name;

	public MoneyManagement(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// Phương thức thông báo số tiền lương

	public void showMessenge(float salary) {
		System.out.println("Your " + name + " have : " + salary + "$");
	}
}
