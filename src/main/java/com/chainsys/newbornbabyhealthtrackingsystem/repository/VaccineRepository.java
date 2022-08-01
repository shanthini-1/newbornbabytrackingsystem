/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.pojo.Vaccine;

/**
 * @author shan3102
 *
 */
public interface VaccineRepository extends CrudRepository<Vaccine, Integer> {
	Vaccine findById(int vac_id);

	Vaccine save(Vaccine vac);

	void deleteById(int vac_id);

	List<Vaccine> findAll();
}
