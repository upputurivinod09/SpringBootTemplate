package myLifeAppServices.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import myLifeAppServices.bean.Person;
import myLifeAppServices.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @RequestMapping(value = "/getAllPersons", method = RequestMethod.GET)
    public List<Person> getAllPersons() {
        logger.info("Get All Persons");
        return personService.getAllPersons();
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody Person person) {
    	logger.info("save person");
    	return personService.savePerson(person);
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public List<Person> deletePerson(@RequestBody Person person) {
    	logger.info("save person");
    	return personService.deletePerson(person);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public List<Person> updatePerson(@RequestBody Person updatePerson) {
    	logger.info("update person");
    	return personService.updatePerson(updatePerson);
    }
    
}
