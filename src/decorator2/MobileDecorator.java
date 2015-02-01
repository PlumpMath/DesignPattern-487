package decorator2;

public abstract class MobileDecorator extends MobilePhone {
	
	// Lớp này để cho các lớp con có thể update chức năng mới 
	// mà không cần thay đổi mã code đã tồn tại

	MobilePhone mobilePhone;

	public MobileDecorator(MobilePhone mobilePhone) {
		// TODO Auto-generated constructor stub
		this.mobilePhone = mobilePhone;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		mobilePhone.call();
	}

}
