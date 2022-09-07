package com.stackroute.main.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.main.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food,Integer> 
{
  //custom method
	Food getFoodByFname(String fname);
	

}
