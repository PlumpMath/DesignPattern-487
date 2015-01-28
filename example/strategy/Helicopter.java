package strategy;

public class Helicopter extends Vehicle {

	public Helicopter() {
		// TODO Auto-generated constructor stub
		setGoAlgorithm(new GoByFlyingAlogorithm());
	}

}
