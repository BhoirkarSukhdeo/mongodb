package com.neosoft.es.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.es.entities.Employee;
@Repository
public interface EmployeeRepositoty extends MongoRepository<Employee, Integer> {

}
