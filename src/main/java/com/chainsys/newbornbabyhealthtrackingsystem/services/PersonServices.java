/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.LoginRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.PersonRepository;

/**
 * @author shan3102
 * @date 02-aug-2022
 */
@Service
public class PersonServices {
	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private LoginRepository loginRepository;

	public List<Person> getPersons() {
		return personRepo.findAll();
	}

//	public Person addPerson(Person thePerson) { 
//		return personRepo.save(thePerson);		
//	}

	public void removePerson(Integer personId) {
		personRepo.deleteById(personId);
	}

	public Person getPersonById(Integer personId) {
		return personRepo.findByUserId(personId);
	}

	@Transactional
	public Person addPerson(Person thePerson) {
		thePerson = personRepo.save(thePerson);
		Login login = new Login();
//			login.setUserId(thePerson.getUserId());
			login.setEmail(thePerson.getEmail());
			login.setRegisterationDate();
			login.setPassWord(thePerson.getPassWord());
			loginRepository.save(login);	
		return thePerson;
	
	}
}
