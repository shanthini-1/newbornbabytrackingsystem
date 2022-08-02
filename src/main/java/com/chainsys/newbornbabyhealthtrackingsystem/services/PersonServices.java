/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.PersonRepository;

/**
 * @author shan3102
 *
 */
@Service
public class PersonServices {
	@Autowired
	private PersonRepository personRepo;

	public List<Person> getPersons() {
		return personRepo.findAll();
	}

}
