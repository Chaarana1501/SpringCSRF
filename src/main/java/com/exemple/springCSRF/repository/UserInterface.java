package com.exemple.springCSRF.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.exemple.springCSRF.entity.User;

@RepositoryRestController
public interface UserInterface extends CrudRepository<User, Long> {

}
