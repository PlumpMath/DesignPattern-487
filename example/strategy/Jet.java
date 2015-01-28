package strategy;

public class Jet extends Vehicle {

	public Jet() {
		// TODO Auto-generated constructor stub
		setGoAlgorithm(new GoByFlyingFastAlogorithm());
	}

}
