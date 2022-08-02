/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;

/**
 * @author shan3102
 *
 */
public interface VaccineRepository extends CrudRepository<Vaccine, Integer> {
	Vaccine findByVaccineId(int vacId);

	Vaccine save(Vaccine vac);

	void deleteById(int vacId);

	List<Vaccine> findAll();
}
