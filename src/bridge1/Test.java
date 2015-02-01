package bridge1;

public class Test {

	/**
	 * Mẫu bridge được sử dụng đẻ linh hoạt sự kế thừa 
	 * Tránh sự ràng buộc khi một lớp thêm một 
	 * chức năng mới ,  thông qua lớp trung gian 
	 * Ta có thể sử dụng chức năng đó mà không phải thay đổi lại mã code 
	 */
	public static void main(String[] args) {

		MyImplementation imp = new ConcreteImplementA();

		MyAbstraction myAbs = new RefineAbtraction1(imp);

		myAbs.method1();
		myAbs.method2();

	}

}
