package chain_of_responsibility2;

public class BranchManager extends PRHandler {

	private static double LIMIT = 25000;

	public BranchManager(String handlerName) {
		super(handlerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean authorized(PurchaseRequest request) {
		// TODO Auto-generated method stub

		double mount = request.getAmount();

		if (mount <= LIMIT) {
			System.out.println("Branch manager " + getHandlerName()
					+ "has authorized the PR - " + request);
			return true;
		} else {
			return getNextHandler().authorized(request);
		}

	}

}
