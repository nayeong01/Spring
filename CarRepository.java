package com.ezdesign.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
	
	List<Car> findByBrand(String brand);
	List<Car> findByColor(String color);
	List<Car> findByYear1(int year1);
	
	//List<Car> findByBrandAndModel(String brand, String model);
	
	//List<Car> findByBrandOrColor(String brand, String color);
	
	//List<Car> findByOrderByYear1Asc(String brand);
	
	@Query("Select c from Car c where c.brand = ?1")
	List<Car> findByBrand1(String brand);
	
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
}
