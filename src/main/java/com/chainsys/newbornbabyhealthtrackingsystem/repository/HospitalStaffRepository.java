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
public interface HospitalStaffRepository extends CrudRepository<HospitalStaff, Integer> {
	HospitalStaff findById(int hosStaffId);

	HospitalStaff save(HospitalStaff hosStaffId);

	void deleteById(int hosStaffId);

	List<HospitalStaff> findAll();

//	Person findByStaffId(int staffId);
}
