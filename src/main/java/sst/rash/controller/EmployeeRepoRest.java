package sst.rash.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sst.rash.entities.Employee;

@RepositoryRestResource(collectionResourceRel = "Employee", path = "newEmployee")
public interface EmployeeRepoRest extends JpaRepository<Employee, Long>{

}
