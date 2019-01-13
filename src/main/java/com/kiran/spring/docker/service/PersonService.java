package com.kiran.spring.docker.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.kiran.spring.docker.model.Person;

@Service
public class PersonService {

	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	
	public PersonService() {
		Person p1 = new Person();
		p1.setId("001");
		p1.setAge(10);
		p1.setFirstName("Tweeki");
		p1.setLastName("Musudi");
		persons.put("001", p1);
		
		Person p2 = new Person();
		p2.setId("002");
		p2.setAge(7);
		p2.setFirstName("Varnika");
		p2.setLastName("Musudi");
		persons.put("002", p2);
	}
	
	public Person getPerson(String id) {
		if(persons.containsKey(id)) {
			return persons.get(id);
		} else {
			return null;
		}
	}
	
	public Hashtable<String, Person> getAll() {
		return persons;
	}
}
