package strategy;

public abstract class Vehicle {

	private GoAlgorithm goAlgorithm;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public void setGoAlgorithm(GoAlgorithm currentGoAlgorithm) {
		goAlgorithm = currentGoAlgorithm;
	}

	public void go() {
		goAlgorithm.go();
	}

}
