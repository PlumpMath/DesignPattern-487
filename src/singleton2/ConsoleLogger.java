package singleton2;


/**
 * @author Quang Huy
 * Mẫu singleton giúp ta khởi tạo một đối tượng duy nhất
 * Ngăn chặn bất kỳ kiểu truy cập nào vào hàm khởi tạo , 
 */
public class ConsoleLogger {

	// Khởi tạo đối tượng Logger toàn cục ,
	// và cấp phát bộ nhớ

	private static ConsoleLogger logger = new ConsoleLogger();

	// Để private cho hàm khởi tạo để
	// chắc chắn là không được gọi tới construtor
	// Ném re ngoại lệ nếu có bất kì lời gọi nào gọi đên hàm khởi tạo
	
    //  Private p = new Private();

    // Constructor<?> con = Private.class.getDeclaredConstructors()[0];
    // con.setAccessible(true);
    // Private p = (Private) con.newInstance();

	private ConsoleLogger() {
		// TODO Auto-generated constructor stub
		System.out.println("Create from construtor !!!");
	}

	// Hàm static để trả về duy nhất một
	// đối tượng logger
	// thêm synchronized để chắc chắn là không có hai
	// luồng khởi tạo đối tượng
	
	public synchronized static ConsoleLogger getConsoleLogger() {
		System.out.println("Create from static method !!!");
		return logger;
	}

}
