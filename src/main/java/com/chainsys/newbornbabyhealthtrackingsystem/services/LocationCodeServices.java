/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.LocationCode;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.LocationCodeRepository;

/**
 * @author shan3102
 * @date 02-aug-2022
 */
@Service
public class LocationCodeServices {
	@Autowired
	private LocationCodeRepository locationCodeRepo;

	public List<LocationCode> getLocation() {
		return locationCodeRepo.findAll();
	}

	public LocationCode addLocation(LocationCode loc) {
		return locationCodeRepo.save(loc);
	}

	public void removeLocation(int locId) {
		locationCodeRepo.deleteById(locId);
	}

	public LocationCode getLocationcodeById(int locId) {
		return locationCodeRepo.findByPinCode(locId);
	}

}
