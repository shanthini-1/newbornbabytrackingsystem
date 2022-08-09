/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.dto.PersonLocationDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.LocationCode;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.LocationCodeRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.PersonRepository;

/**
 * @author shan3102
 * @date 02-aug-2022
 */
@Service
public class PersonServices {
	@Autowired
	private PersonRepository personRepo;
	
	public List<Person> getPersons() {
		return personRepo.findAll();
	}

	public Person addPerson(Person thePerson) {
		return personRepo.save(thePerson);		
	}

	public void removePerson(Integer personId) {
		personRepo.deleteById(personId);
	}

	public Person getPersonById(Integer personId) {
		return personRepo.findByUserId(personId);
	}


}
