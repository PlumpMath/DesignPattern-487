package chain_of_responsibility2;

public class VicePresident extends PRHandler {
	
	private static double LIMIT = 200000;

	public VicePresident(String handlerName) {
		super(handlerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean authorized(PurchaseRequest request) {
		// TODO Auto-generated method stub

		double mount = request.getAmount();

		if (mount <= LIMIT) {
			System.out.println("Vice president " + getHandlerName()
					+ "has authorized the PR - " + request);
			return true;
		} else {
			return getNextHandler().authorized(request);
		}

	}

}
