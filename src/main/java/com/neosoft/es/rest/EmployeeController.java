package com.neosoft.es.rest;

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
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.es.entities.Employee;
import com.neosoft.es.repository.EmployeeRepositoty;

@RestController
@RequestMapping("/service")
public class EmployeeController {

    @Autowired
    private EmployeeRepositoty employeeRepositoty;
    
    @PostMapping("/employees")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeRepositoty.save(employee),HttpStatus.OK);
    }
    
    
    @GetMapping("/employees")
    public ResponseEntity<?> getEmployees(){
        return new ResponseEntity<List>(employeeRepositoty.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeDetails(@PathVariable ("id") Integer id){
        return new ResponseEntity<Employee>(employeeRepositoty.findById(id).get(),HttpStatus.OK);
    }
    
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployeeDetails(@PathVariable ("id") Integer id){
        employeeRepositoty.deleteById(id);
        return new ResponseEntity<String>("employee details delete success",HttpStatus.OK);
    }
}
