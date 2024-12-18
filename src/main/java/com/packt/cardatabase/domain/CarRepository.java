package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {


  List<Car> findByBrand(@Param("brand") String brand);
  List<Car> findByColor(@Param("color") String color);
  List<Car> findByModelYear(int modelYear);

  // Fetch cars by brand and color
//  List<Car> findByBrandAndModel(String brand, String model);
//  // Fetch cars by brand or color
//  List<Car> findByBrandOrColor(String brand, String color);
//
//  // Fetch cars by brand and sort by year
//  List<Car> findByBrandOrderByModelYearAsc(String brand);

  /*
  If you use the @Query annotation and write SQL queries in your code, your application might be
   less portable across different database systems.
   */
  @Query("select c from Car c where c.id = ?1")
  List<Car> findById(@Param("id") int id);
}
