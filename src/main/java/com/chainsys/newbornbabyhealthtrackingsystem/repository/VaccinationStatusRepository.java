/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;

/**
 * @author shan3102
 *
 */
public interface VaccinationStatusRepository extends CrudRepository<VaccinationStatus, Integer> {
	VaccinationStatus findById(int childId);

	VaccinationStatus save(VaccinationStatus vaccineStatus);

	void deleteById(int childId);

	List<VaccinationStatus> findAll();
}
