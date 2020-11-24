package academy.learnprogramming.bbbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"academy.learnprogramming.bbms.service", "academy.learnprogramming.bbbms.controller"})
public class BbBmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbBmsApplication.class, args);
	}

}
