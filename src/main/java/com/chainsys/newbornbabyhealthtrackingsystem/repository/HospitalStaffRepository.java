/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.HospitalStaff;

/**
 * @author shan3102
 *
 */
public interface HospitalStaffRepository extends CrudRepository<HospitalStaff, Integer> {
	Optional<HospitalStaff> findById(Integer hosStaffId);

	HospitalStaff save(HospitalStaff hosStaffId);

	void deleteById(Integer hosStaffId);

	List<HospitalStaff> findAll();

//	Person findByStaffId(Integer staffId);
}
