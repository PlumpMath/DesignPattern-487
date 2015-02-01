package bridge2;

public abstract class Day implements DailyWork {

	private DailyWork dlWork;

	public Day(DailyWork dlWork) {
		// TODO Auto-generated constructor stub
		this.dlWork = dlWork;
	}

	public abstract void doSomeThingAtNight();

	public abstract void doSomeThingInTheAfternoon();

	public abstract void doSomeThingInTheEvening();

	public abstract void doSomeThingInTheMorning();

	public abstract void doSomeThingOverNight();

	public final void action() {
		doSomeThingInTheMorning();
		doSomeThingInTheAfternoon();
		doSomeThingInTheEvening();
		doSomeThingAtNight();
		doSomeThingOverNight();
	}

}
