package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Optional<Owner> findByFirstname(String firstName);


  List<Owner> findByLastname(@Param("lastname") String lastname);

}
