package strategy;

public class FormulaOne extends Vehicle {
	
	public FormulaOne() {
		// TODO Auto-generated constructor stub
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}

}
