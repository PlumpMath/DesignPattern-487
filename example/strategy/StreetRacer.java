package strategy;

public class StreetRacer extends Vehicle {

	public StreetRacer() {
		// TODO Auto-generated constructor stub
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}

}
