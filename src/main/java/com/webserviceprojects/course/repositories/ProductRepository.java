package com.webserviceprojects.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webserviceprojects.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
