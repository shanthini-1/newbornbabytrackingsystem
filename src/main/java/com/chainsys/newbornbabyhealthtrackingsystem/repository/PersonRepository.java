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
public interface PersonRepository extends CrudRepository<Person, Integer> {
	Person findByUserId(Integer id);

	void deleteById(Integer psrn);

	List<Person> findAll();

	List<Person> findAllByPinCode(int pincode);

	<S extends Person> S save(S person);
}
