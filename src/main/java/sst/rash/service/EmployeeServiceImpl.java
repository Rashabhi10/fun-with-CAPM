package sst.rash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sst.rash.entities.Employee;
import sst.rash.repository.EmployeeRepository;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee changeEmployee(Employee employee) {
		Optional<Employee> emp = employeeRepository.findById(employee.getId());
		if(!emp.isPresent()) {
			return new Employee();
		}
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		this.employeeRepository.delete(employee);		
	}

	@Override
	public List<Employee> searchCompanyName(String company) {
		return employeeRepository.findByCompanyName(company);
	}

	@Override
	public List<Employee> lookUpEmployeeByExp(long years) {
		return employeeRepository.lookUpEmployeeByExp(years);
	}

	@Override
	public Employee singleEmployee(long id) {
		Optional<Employee> searchResult = employeeRepository.findById(id);
		if(searchResult.isEmpty()) {
			return new Employee();
		}
		return searchResult.get();
		
//		return employeeRepository.findById(id);
	}

	@Override
	public List<Employee> saveAllEmp(List<Employee> empList) {
		List<Employee> list = (List<Employee>) employeeRepository.saveAll(empList);
		return list;
	}
	
}
