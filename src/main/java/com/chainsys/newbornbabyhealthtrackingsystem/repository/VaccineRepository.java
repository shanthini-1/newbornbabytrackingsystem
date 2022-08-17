/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;
//import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;

/**
 * @author shan3102
 *
 */
public interface VaccineRepository extends CrudRepository<Vaccine, Integer> {
	Vaccine findByVaccineId(int vaccineId);

	<S extends Vaccine> S save(S vac);

	void deleteById(int vacId);

	List<Vaccine> findAll();

}
