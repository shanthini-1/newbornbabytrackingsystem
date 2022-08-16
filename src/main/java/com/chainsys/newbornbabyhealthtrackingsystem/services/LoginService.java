package com.chainsys.newbornbabyhealthtrackingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.LoginRepository;

public class LoginService {
	
	@Autowired
	private LoginRepository loginRepo;
	
	public Login addUser(Login login) {
		return loginRepo.save(login);
		
	}

}
