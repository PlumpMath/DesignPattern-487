package factory1;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

	public boolean isFileLogginfEnable() {

		Properties p = new Properties();
		try {		
			/*
			 * Lấy dữ liệu từ luồng trỏ từ file Logger.properties
			 * chứa trong folder resource
			 * */	
			p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
			
			// FileLogging là key , và chuỗi String
			// fileLoggingValue được ra từ
			//  file Logger.properties thong qua key
			
			String fileLoggingValue = p.getProperty("FileLogging");
			
			// Nếu giá trị = ON thì trả lại true
			// và ngược lại
			if (fileLoggingValue.equalsIgnoreCase("ON") == true)
				return true;
			else
				return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * Tùy theo trạng thái mà đối tượng sẽ được chọn để trả về
	 * Sau khi kiểm tra trạng thái của FileLogger 
	 * Phương thức sẽ lựa chọn đối tượng Logger để trả về 
	 */
	public Logger getLogger() {
		
		if (isFileLogginfEnable())
			return new FileLogger();
		else
			return new ConsoleLogger();
	}
	

	

}
