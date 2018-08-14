package myLifeAppServices.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import myLifeAppServices.bean.Person;

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
		Person newPerson = new Person(person.getFirstName(), person.getLastName());
		persons.add(newPerson);
		return persons;
	}

	public List<Person> delete(Person person) {
		List<Person> persons = getPersons();
		persons.remove(person);
		return persons;
	}

	public List<Person> update(Person updatePerson) {
		List<Person> persons = getPersons();
		
//		Person deletePerson = persons.stream()
//								.filter(p -> p.getId() == updatePerson.getId())
//								.findFirst()
//								.get();
		Person deletePerson = null;
		for(Person person: persons) {
			if(person.getId().equals(updatePerson.getId())) {
				deletePerson = person;
			}
		}
		delete(deletePerson);
		savePerson(updatePerson);
		
		return persons;
	}
	
	

}
