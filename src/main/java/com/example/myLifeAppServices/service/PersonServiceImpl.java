package com.example.myLifeAppServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myLifeAppServices.bean.Person;
import com.example.myLifeAppServices.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	

	@Override
	public List<Person> getAllPersons() {
		return personRepository.getAllPersons();
	}


	@Override
	public List<Person> savePerson(Person person) {
		return personRepository.savePerson(person);
	}


	@Override
	public List<Person> deletePerson(Person person) {
		return personRepository.delete(person);
	}


	@Override
	public List<Person> updatePerson(Person updatePerson) {
		return personRepository.update(updatePerson);
	}

}
