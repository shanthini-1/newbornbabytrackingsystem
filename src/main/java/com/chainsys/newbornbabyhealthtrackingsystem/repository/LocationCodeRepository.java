/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.LocationCode;

/**
 * @author shan3102
 * @date   1/8/2022 
 */
public interface LocationCodeRepository extends CrudRepository<LocationCode, Integer> {
	LocationCode findByPinCode(int locCode);

	LocationCode save(LocationCode locCode);

	void deleteById(int locCode);

	List<LocationCode> findAll();
}
