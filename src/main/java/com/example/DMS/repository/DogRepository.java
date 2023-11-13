/**
 * 
 */
package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

/**
 * @author Harshitha Chowdary Alapati
 * Nov 11, 2023
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	

}
