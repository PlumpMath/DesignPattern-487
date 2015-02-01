package facade2;

public class Factory {

	private Cooking cook;
	private Market market;
	private Person person;

	public Factory(Cooking cook, Market market, Person person) {
		super();
		this.cook = cook;
		this.market = market;
		this.person = person;
	}

	public void makeACake() {
		market.getAMaterial();
		person.turnOnTheMachine();
		cook.cook();

	}

}
