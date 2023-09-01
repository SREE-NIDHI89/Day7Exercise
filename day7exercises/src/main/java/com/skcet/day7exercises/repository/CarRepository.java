package com.skcet.day7exercises.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.skcet.day7exercises.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Integer> {
	   
    //JPQL 

    @Query("select c from CarEntity c")
   public List<CarEntity> getAllCarsUsingJPQL();
}
