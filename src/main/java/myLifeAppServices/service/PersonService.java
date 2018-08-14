package myLifeAppServices.service;

import java.util.List;

import myLifeAppServices.bean.Person;

public interface PersonService {

	List<Person> getAllPersons();

	List<Person> savePerson(Person person);

	List<Person> deletePerson(Person person);

	List<Person> updatePerson(Person person);
	
}
