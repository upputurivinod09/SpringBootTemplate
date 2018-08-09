package com.example.myLifeAppServices.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.myLifeAppServices.bean.Person;

@Repository
public class PersonRepository {
	
	private static List<Person> persons;
	
	//Singleton Design Pattern
	public static List<Person> getPersons() {
		if(persons == null) {
			Person vinod = new Person("Vinod", "Upputuri");
			Person anusha = new Person("Anusha", "Upputuri");
			Person sudeeksha = new Person("Sudeeksha", "Upputuri");
			persons = new ArrayList<>();
			persons.add(vinod);
			persons.add(anusha);
			persons.add(sudeeksha);
		}
		return persons;
	}

	public List<Person> getAllPersons() {
		List<Person> persons = getPersons();
		return persons;
	}

	public List<Person> savePerson(Person person) {
		List<Person> persons = getPersons();
		persons.add(person);
		return persons;
	}

	public List<Person> delete(Person person) {
		List<Person> persons = getPersons();
		persons.remove(person);
		return persons;
	}
	
	

}
