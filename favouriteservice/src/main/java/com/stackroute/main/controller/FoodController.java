package com.stackroute.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.main.model.Food;
import com.stackroute.main.repository.FoodRepository;
import com.stackroute.main.service.FoodService;

@RestController
@RequestMapping("/api/")
public class FoodController{

	@Autowired
	private FoodService foodservice;
	
	//Handlers
	@PostMapping("food")
	public ResponseEntity<Food> save(@RequestBody Food food){
		this.foodservice.saveFood(food);
		return new ResponseEntity<Food>(food, HttpStatus.CREATED);
	}
	@GetMapping("foods")
	public ResponseEntity<List<Food>> getAllFood(){
		List<Food> list=this.foodservice.getAllFood();
		return new ResponseEntity<List<Food>>(list, HttpStatus.OK);
		
	}
	@GetMapping("foodname/{fname}")
	public ResponseEntity getFoodByName(@PathVariable String fname) {
	Food food=this.foodservice.getFoodByName(fname);
	if(food!=null) {
		return new ResponseEntity<Food>(food,HttpStatus.OK);
}else
	return new ResponseEntity<String>("Not-found", HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("foodid/{id}")
	public ResponseEntity<?> deleteFoodById(@PathVariable int id) {
		boolean b=this.foodservice.deleteFoodById(id);
		if(b)
			return new ResponseEntity<Object>("SUCCESSFULLY DELETED",HttpStatus.OK);
		else
			return new ResponseEntity<Object>("Not-Found",HttpStatus.NOT_FOUND);
	}
	
}