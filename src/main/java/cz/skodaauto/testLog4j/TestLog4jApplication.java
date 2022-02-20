package cz.skodaauto.testLog4j;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestLog4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLog4jApplication.class, args);

		log.info("----------------------------------------------------");
		log.trace("This Will Be Printed On Trace");
		log.debug("This Will Be Printed On Debug");
		log.info("This Will Be Printed On Info");
		log.warn("This Will Be Printed On Warn");
		log.error("This Will Be Printed On Error");
		log.info("Appending string: {}.", "Hello, World");
		log.info("----------------------------------------------------");

	}

}
