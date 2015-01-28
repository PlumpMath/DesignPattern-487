package bridge1;

public class OrdinaryDay implements DailyWork {

	@Override
	public void doSomeThingInTheMorning() {
		// TODO Auto-generated method stub
		System.out.println("Sáng đi học thầy Quế ...");
	}

	@Override
	public void doSomeThingInTheAfternoon() {
		// TODO Auto-generated method stub
		System.out.println("Chiều đi uống trà đá với người yêu ...");
	}

	@Override
	public void doSomeThingInTheEvening() {
		// TODO Auto-generated method stub
		System.out.println("Tối đi hẹn hò với bạn bè ...");
	}

	@Override
	public void doSomeThingAtNight() {
		// TODO Auto-generated method stub
		System.out.println("Tối thì phải đi ngủ sớm ...");
	}

	@Override
	public void doSomeThingOverNight() {
		// TODO Auto-generated method stub
		System.out.println("Buổi đêm nằm đắn đo xem có nên bùng học ngày mai không ...");
	}

}
