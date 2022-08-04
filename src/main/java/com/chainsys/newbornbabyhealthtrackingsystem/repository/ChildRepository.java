/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;

/**
 * @author shan3102
 *
 */
@Repository
public interface ChildRepository extends CrudRepository<Child, Integer>{
	Child findById(int id);

	Child save(Child childld);

	void deleteById(int childId);

	List<Child> findAll();
}
 