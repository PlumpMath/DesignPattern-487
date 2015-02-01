package decorator2;

public class VideoCall extends MobileDecorator {
	private MobilePhone mobilePhone;

	public VideoCall(MobilePhone mobilePhone) {
		super(mobilePhone);
		// TODO Auto-generated constructor stub
		this.mobilePhone = mobilePhone;
	}
	
	// Thêm chức năng mới gọi điện bằng video 
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Play video ...");
		mobilePhone.call();
	}

}
