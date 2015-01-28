package factory1;

/**
 * @author Quang Huy
 * Mẫu factory cho phép ta khởi tạo đối tượng 
 * dựa vào trạng thái đưa vào factory để có thể 
 * trả về đúng đối tượng cần thiết  
 */
public class ConsoleLogger implements Logger {
	
	// Phương thức chỉ hiện msg ra 
	// màn hình Console

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
