package sst.rash.service;

import java.util.List;

import org.springframework.stereotype.Component;

import sst.rash.entities.Employee;

@Component
public interface EmployeeService {
	List<Employee> getAllEmployee();
	Employee saveEmployee(Employee employee);
	Employee changeEmployee(Employee employee);
	void deleteEmployeeById(long id);
	void deleteEmployee(Employee employee);
	List<Employee> searchCompanyName(String company);
	List<Employee> lookUpEmployeeByExp(long years);
	Employee singleEmployee(long id);
	List<Employee> saveAllEmp(List<Employee> empList);
}