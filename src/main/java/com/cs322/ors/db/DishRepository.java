package com.cs322.ors.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs322.ors.model.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
	
	
}
