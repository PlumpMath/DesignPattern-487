package decorator2;

public class BlutoothCall extends MobileDecorator {
	private MobilePhone mobilePhone;

	public BlutoothCall(MobilePhone mobilePhone) {
		super(mobilePhone);
		// TODO Auto-generated constructor stub
		this.mobilePhone = mobilePhone;
	}
	
	
	// Update thêm chức năng gọi bằng blutooth
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Turn on Blutooth ... ");
		mobilePhone.call();
	}

}
