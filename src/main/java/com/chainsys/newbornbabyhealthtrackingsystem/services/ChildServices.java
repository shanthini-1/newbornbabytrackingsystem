/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.ChildRepository;

/**
 * @author shan3102
 *
 */
@Service
public class ChildServices {
	@Autowired
	private ChildRepository childRepo;

	public List<Child> getChilds() {
		return childRepo.findAll() ;
	}

	public Child getChildById(int childId) {
		return childRepo.findById(childId);
	}

	public Child addChild(Child theChild) {
		return childRepo.save(theChild);
	}

	public void removeChild(int childId) {
		childRepo.deleteById(childId);
	}

}
