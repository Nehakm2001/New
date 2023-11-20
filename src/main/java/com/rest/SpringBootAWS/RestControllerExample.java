package com.rest.SpringBootAWS;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api")
public class RestControllerExample {
	/*
	 * @GetMapping("/aws") public ResponseEntity display() { return new
	 * ResponseEntity("I was landed on AWS Cloud",HttpStatus.ACCEPTED); }
	 */
	static int i = 0;
	@Scheduled(cron = "*/10 * * * * *")
	public void displayTask1() {
		System.out.println("Sending Cron Message= " + i);
		i++;
	}
	@Scheduled(fixedRate = 1000)
	public void displayTask() {
		System.out.println("Sending Message= " + i);
		i++;

	}
}
