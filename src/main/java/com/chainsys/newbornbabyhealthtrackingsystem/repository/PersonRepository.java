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
	Person findByUserId(int id);

	Person save(Person prsn);

	void deleteById(int prsn_id);

	List<Person> findAll();
}
