package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Person;
import service.PersonService;

@Controller
public class PersonController {
	
	@RequestMapping("/person")
	public String person(Model model) {  // this Model object is a UI object. Look at the package.
		
		PersonService service = new PersonService();
		
		// this is where you would normally go out to the service layer to return a db object or something.
		Person p = service.getPerson();
		
		model.addAttribute("person", p);
		return "personview";
	}
}
