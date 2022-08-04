/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;

/**
 * @author shan3102
 *
 */
public interface HospitalRepository extends CrudRepository<Hospital, Integer> {
	Hospital findByHospitalId(int hosId);

	Hospital save(Hospital hos);

	void deleteById(int hosId);

	List<Hospital> findAll();
}
