package com.kiran.spring.docker.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.spring.docker.model.Person;
import com.kiran.spring.docker.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService personservice;
	
	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return personservice.getPerson(id);
	}
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getAll() {
		return personservice.getAll();
	}
	
}
