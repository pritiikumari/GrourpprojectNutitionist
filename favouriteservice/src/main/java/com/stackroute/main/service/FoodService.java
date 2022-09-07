package com.stackroute.main.service;


import java.util.List;
import com.stackroute.main.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.main.repository.FoodRepository;

@Service
public interface FoodService {
	public void saveFood(Food food);
	public List<Food> getAllFood();
	public Food getFoodByName(String fname) ;
	public boolean deleteFoodById(int id);
}