package raisetech.homework6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Homework6Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework6Application.class, args);
	}

	@RequestMapping("/hello")
	String index() {
		double judge = Math.random();
		if (0.7 <= judge) {
			return "Hello World あなたの運勢は大吉";
		} else if (0.4 <= judge) {
			return "Hello World あなたの運勢は吉";
		} else if (0.1 <= judge) {
			return "Hello World あなたの運勢は末吉";
		} else {
			return "Hello World あなたの運勢は凶";
		}
	}
}