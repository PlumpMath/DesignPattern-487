package bridge1;

public class Monday extends Day {

	private DailyWork dlWork;;

	public Monday(DailyWork dlWork) {
		super(dlWork);
		// TODO Auto-generated constructor stub
		this.dlWork = dlWork;
	}

	@Override
	public void doSomeThingAtNight() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingAtNight();
	}

	@Override
	public void doSomeThingInTheAfternoon() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingInTheAfternoon();
	}

	@Override
	public void doSomeThingInTheEvening() {
		// TODO Auto-generated method stub
		System.out.println("Buổi chiều Vào thư viện đọc truyện ngôn tình ...");
	}

	@Override
	public void doSomeThingInTheMorning() {
		// TODO Auto-generated method stub
		dlWork.doSomeThingInTheMorning();

	}

	@Override
	public void doSomeThingOverNight() {
		// TODO Auto-generated method stub
		System.out.println("Buổi đêm làm bài tập về nha ...");
	}

}
