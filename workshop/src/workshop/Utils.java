package workshop;

public class Utils {
public static void runLoggers(Logger[] loggers,Product product) {
	for(Logger logger:loggers) {
		logger.log(product);
	}
}
}
