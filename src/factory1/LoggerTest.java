package factory1;

public class LoggerTest {
	
	// Phương thức main

	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger();
		logger.log("A message to log");
	}

}
