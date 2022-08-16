package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

	public Login save(Login login);

}
