package logging.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggingAppController {
	
	private static Logger logger = Logger.getLogger(LoggingAppController.class);
	
	@RequestMapping
	public String showHomePage() {
		logger.info("Going to homepage");
		return "home";
	}
	
}
