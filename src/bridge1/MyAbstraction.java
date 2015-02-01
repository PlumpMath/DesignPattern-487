package bridge1;

public class MyAbstraction {
	
	// Tham chiếu đến đối tượng Myimplementation
	// để có thể sử dụng các phương thức đã được cài đắt sẵn

	private MyImplementation myImp;
	
	// Hàm khởi tạo để lấy tham chiếu tư một lớp thực thi cụ thể

	public MyAbstraction(MyImplementation myImp) {
		// TODO Auto-generated constructor stub
		this.myImp = myImp;
	}

	public void method1() {
		myImp.doMthod1();
	}

	public void method2() {
		myImp.doMthod2();
	}

}
