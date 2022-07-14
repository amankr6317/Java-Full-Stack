import java.util.logging.Logger;

public class LoggerDemo {

	private static Logger logger;

	public static void main(String[] args) {
		logger.info("Hello, I am info logger.");
		logger.warning("Hello, no date is provided. So, taking the system date as DOJ");
		logger.severe("Error message. Can not connect to the service DateAPI.");
	}

	static {
		System.setProperty("java.util.logging.config.file","D:/My Workspace/11-04-2022logging.properties");
		logger = Logger.getLogger(LoggerDemo.class.getName());
	}
}
