package decorator2;

/**
 * Bản chất của mẫu decorator là mở rộng chức năng của lớp cơ bản
 * ban đầu mà không cần thay đổi mã code đã có ,
 * nó bao bọc các lớp cơ bản rồi thêm chức năng mới 
 *
 */
public class Test {

	public static void main(String[] args) {

		MobilePhone mobile = new MobilePhone();
		mobile.call();
		MobileDecorator ver1 = new VideoCall(mobile);
		ver1.call();
		MobileDecorator ver2 = new BlutoothCall(ver1);
		ver2.call();
	}

}
