package com.incorporation.incorporation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//instead of a data service you will have this
//This will interact with the database

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByLastName(String lastName);


}



