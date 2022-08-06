/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;

/**
 * @author shan3102
 *
 */
public interface VaccinationStatusRepository extends CrudRepository<VaccinationStatus, ChildVaccineCompositeTable> {
	Optional<VaccinationStatus> findById(ChildVaccineCompositeTable compId);

	VaccinationStatus save(VaccinationStatus vaccineStatus);

	void deleteById(ChildVaccineCompositeTable compId);

	List<VaccinationStatus> findAll();
	List<VaccinationStatus> findByChildId(int id);

	static List<VaccinationStatus> findChilById(int childId) {
		// TODO Auto-generated method stub
		return null;
	}
}
