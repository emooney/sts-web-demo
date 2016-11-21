package controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Greeting;

@Controller
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
//	@RequestMapping("/greeting")
//	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//		
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	}
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
	
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
	
}
