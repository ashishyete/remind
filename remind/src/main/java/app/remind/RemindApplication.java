package app.remind;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemindApplication {

	final static Logger logger = Logger.getLogger(RemindApplication.class);
	
	public static void main(String[] args) {
		logger.info("Remind - Application Starting");
		SpringApplication.run(RemindApplication.class, args);
	}
}
