package atto.recruit.healthChecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HealthCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckerApplication.class, args);
	}

}
