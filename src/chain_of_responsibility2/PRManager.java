package chain_of_responsibility2;

public class PRManager {

	private BranchManager branchManager;
	private RegionalDirector regionalDirector;
	private VicePresident vicePresident;
	private PresidentCOO coo;

	public static void main(String[] args) {

		PRManager manager = new PRManager();
		manager.createAuthorizationFlow();

		PurchaseRequest request = new PurchaseRequest(1, "Office Supplies",
				10000);
		manager.branchManager.authorized(request);
		request = new PurchaseRequest(2, "HardWare Procurement ", 175000);
		manager.branchManager.authorized(request);
		request = new PurchaseRequest(3, "AD Campaign ", 800000);
		manager.branchManager.authorized(request);

	}

	private void createAuthorizationFlow() {
		// TODO Auto-generated method stub
		branchManager = new BranchManager("Robin");
		regionalDirector = new RegionalDirector("Oscar");
		vicePresident = new VicePresident("Kate");
		coo = new PresidentCOO("Drew");

		branchManager.setNextHandler(regionalDirector);
		regionalDirector.setNextHandler(vicePresident);
		vicePresident.setNextHandler(coo);
	}

}
