/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;

/**
 * @author shan3102
 *
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
	Person findByUserId(long id);

	void deleteById(long psrn);

	List<Person> findAll();

	List<Person> findAllByPinCode(int pincode);

	Person save(Person prsn);
}
