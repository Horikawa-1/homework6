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
	String hello() {
		String Hello = "Hello World" + System.lineSeparator() + "あなたの運勢は・・・";
		double luck = Math.random();
		if (0.7 <= luck) {
			return Hello + "大吉";
		} else if (0.4 <= luck) {
			return Hello + "吉";
		} else if (0.1 <= luck) {
			return Hello + "末吉";
		} else {
			return Hello + "凶";
		}
	}
}