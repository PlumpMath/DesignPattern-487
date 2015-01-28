package bridge1;

public class Sunday extends Day {
	
	private DailyWork dlWork;;

	public Sunday(DailyWork dlWork) {
		super(dlWork);
		// TODO Auto-generated constructor stub
		this.dlWork = dlWork;
	}

	@Override
	public void doSomeThingAtNight() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingInTheMorning();
	}

	@Override
	public void doSomeThingInTheAfternoon() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingInTheAfternoon();
	}

	@Override
	public void doSomeThingInTheEvening() {
		// TODO Auto-generated method stub
		System.out.println("Chiều rảnh vào thư viện chơi game ...");
	}

	@Override
	public void doSomeThingInTheMorning() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingAtNight();
	}

	@Override
	public void doSomeThingOverNight() {
		// TODO Auto-generated method stub
	System.out.println("Đêm thì tất nhiên là ... vẫn đang ngủ say rồi ...");
	}

}
