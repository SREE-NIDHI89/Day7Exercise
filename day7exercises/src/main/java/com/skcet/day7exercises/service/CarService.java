package com.skcet.day7exercises.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.skcet.day7exercises.entity.CarEntity;
import com.skcet.day7exercises.repository.CarRepository;




@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public CarEntity saveCars(CarEntity c) {
		return carRepository.save(c);
	}
	
	   //JPQL
	
		public List<CarEntity> getAllCarsUsingJPQL(){
			return carRepository.getAllCarsUsingJPQL();
		}

}
