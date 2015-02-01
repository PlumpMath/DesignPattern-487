package bridge1;

public class RefineAbtraction2 extends MyAbstraction{
	
	// Kế thừa lại lớp MyAbstraction để sử dụng các phương thức đã có sẵn

	public RefineAbtraction2(MyImplementation myImp) {
		super(myImp);
		// TODO Auto-generated constructor stub
	}
	
	// Nhưng vẫn có thể tự cài đặt phương thức theo ý mình
	// Tránh được sự ràng buộc từ implements các Interface
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("GHI");
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}

}
