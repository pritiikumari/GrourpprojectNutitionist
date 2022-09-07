package com.stackroute.main.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.main.model.Food;
import com.stackroute.main.repository.FoodRepository;


@Service
public class FoodServiceImpl implements FoodService{
	@Autowired
     private FoodRepository foodrepository;
	
	public void saveFood(Food food) {
		this.foodrepository.save(food);
	}
	public List<Food> getAllFood(){
		return this.foodrepository.findAll();
	}

	public boolean deleteFoodById(int id) {
		this.foodrepository.deleteById(id);
		return true;
	}
	public Food getFoodByName(String fname) {
		Food food=this.foodrepository.getFoodByFname(fname);
		if(food!=null) {
			return food;
		}
		else
			return null;
		}
}


