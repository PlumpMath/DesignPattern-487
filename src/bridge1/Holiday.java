package bridge1;

public class Holiday implements DailyWork {

	@Override
	public void doSomeThingInTheMorning() {
		// TODO Auto-generated method stub
		System.out.println("Sang rồi , đi ngủ thôi !!!");
	}

	@Override
	public void doSomeThingInTheAfternoon() {
		// TODO Auto-generated method stub
		System.out.println("Trưa thì ngủ dậy rồi chơi game !!!");
	}

	@Override
	public void doSomeThingInTheEvening() {
		// TODO Auto-generated method stub
		System.out.println("Buổi chiều , đi ngủ tiếp thôi !!!");
	}

	@Override
	public void doSomeThingAtNight() {
		// TODO Auto-generated method stub
		System.out.println(" Buổi tối chơi game tiếp thôi !!!");
	}

	@Override
	public void doSomeThingOverNight() {
		// TODO Auto-generated method stub
		System.out.println(" Đêm hôm , thao thức nghĩ về tương lai của nhân loại !!!");
	}

}
