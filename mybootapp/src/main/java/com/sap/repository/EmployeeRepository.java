package com.sap.repository;

import org.springframework.data.repository.CrudRepository;

import com.sap.models.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}