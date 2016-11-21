package service;

import model.Person;


public class PersonService {
	
	private Person p;
	
	public Person getPerson() {
		Person me = new Person();
		me.setAge(48);
		me.setFirstName("Eric");
		me.setLastName("ooney");
		
		return me;
	}
}
