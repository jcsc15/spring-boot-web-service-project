package com.webserviceprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserviceprojects.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
