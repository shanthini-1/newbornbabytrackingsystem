/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
//import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;

/**
 * @author shan3102
 *
 */
@Repository
public interface ChildRepository extends JpaRepository<Child, Integer>{
	Child findById(int id);

	Child save(Child childld);

	void deleteById(int childId);

	List<Child> findAll();

	List<Child> findAllByHospitalId(int hospitalId);
	List<Child> findAllByDoctorId(long doctorId);

	List<Child> findAllByFatherIdAndMotherId(long fatherId,long motherId);
//	List<Child> findAllByMotherId(long parentId);
	List<Child> findAllByGuardianId(long guardianId);
	

//	List<Child> findById(VaccinationStatus vaccinationStatus);
}
 