package com.microservice.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.security.entities.User;



/**

 * User repository for CRUD operations.

 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

}
