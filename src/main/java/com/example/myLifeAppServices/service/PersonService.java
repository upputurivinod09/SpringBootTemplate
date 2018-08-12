package com.example.myLifeAppServices.service;

import java.util.List;

import com.example.myLifeAppServices.bean.Person;

public interface PersonService {

	List<Person> getAllPersons();

	List<Person> savePerson(Person person);

	List<Person> deletePerson(Person person);

	List<Person> updatePerson(Person person);
	
}
