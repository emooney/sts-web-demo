package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ComponentScan({"demo","controller"})
@Controller
public class DemoApplication {

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return("My Spring Boot App from STS! =)");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
}
