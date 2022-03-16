package com.onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinegasbooking.entity.Login;

/**
 * 
 * @author Sneha Soni
 * It contains the full API of CrudRepository and PagingAndSortingRepository. 
 * So it contains API for basic CRUD operations and also API for pagination and sorting.
 *
 */

public interface LoginRepository extends JpaRepository<	Login, Integer>{
	
	
	
}
