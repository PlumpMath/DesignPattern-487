package singleton1;

public class FileLogger {

	// Khởi tạo đối tượng Logger toàn cục

	private static FileLogger logger;

	// Để private cho hàm khởi tạo để
	// chắc chắn là không được gọi tới construtor
	
	private FileLogger() {
		// TODO Auto-generated constructor stub
	}

	// Hàm static để trả về duy nhất một 
	// đối tượng logger
	public static FileLogger getFileLogger() {
		if (logger == null) {
			logger = new FileLogger();
		}
		return logger;
	}

}
