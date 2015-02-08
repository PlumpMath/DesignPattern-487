package chain_of_responsibility2;

public class PurchaseRequest {

	private int ID;
	private String description;
	private double amount;

	public PurchaseRequest(int iD, String description, double amount) {
		super();
		ID = iD;
		this.description = description;
		this.amount = amount;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID + ":" + description;
	}

}
