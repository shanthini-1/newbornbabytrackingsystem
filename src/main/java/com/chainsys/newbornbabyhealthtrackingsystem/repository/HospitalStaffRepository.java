/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.HospitalStaff;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;

/**
 * @author shan3102
 *
 */
public interface HospitalStaffRepository extends CrudRepository<HospitalStaff, Long> {
	HospitalStaff findById(long hosStaffId);

	HospitalStaff save(HospitalStaff hosStaffId);

	void deleteById(long hosStaffId);

	List<HospitalStaff> findAll();

//	Person findByStaffId(long staffId);
}
