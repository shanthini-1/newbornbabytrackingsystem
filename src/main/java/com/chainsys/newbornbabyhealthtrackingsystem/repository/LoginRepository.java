package com.chainsys.newbornbabyhealthtrackingsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

	<S extends Login> S save(S login);

}
