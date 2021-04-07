package sst.rash.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sst.rash.entities.Employee;
import sst.rash.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping("/employee/{id}")
	public Employee getById(@PathVariable(value = "id") Long id) {
		return employeeService.singleEmployee(id);
	}

//	@PostMapping("/employee")
//	public Employee createEmployee(@RequestBody Employee emp) {
//		return employeeRepository.save(emp);
//	}
//
	@RequestMapping(method = RequestMethod.PUT, value = "/changeemployee")
	public Employee updateEmployee(@RequestBody Employee changedata) {
		return employeeService.changeEmployee(changedata);
	}
	
	@PostMapping("/postEmployee")
	public Employee postEmployee(@RequestBody Employee postdata) {
		return employeeService.saveEmployee(postdata);
	}
	
//
//	@DeleteMapping("/deleteEmployee/{id}")
//	@GetMapping("/deleteEmployee/{id}")
	@RequestMapping(method = RequestMethod.DELETE,value = "/deleteEmployee/{id}" )
	public void deleteEmployee(@PathVariable(value = "id") Long id) {
		this.employeeService.deleteEmployeeById(id);
//		return "redirect:/";
	}
	
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployeeAll(@RequestBody Employee deletedata) {
		this.employeeService.deleteEmployee(deletedata);
	}
	
	@RequestMapping("/employee/search")
	public List<Employee> searchByCompanName(@RequestParam String companyName){
		return employeeService.searchCompanyName(companyName);
		
	}
	
//	@RequestMapping("/employee/exp") //requesting a parameter with => employee/exp?years=5
	@RequestMapping("/employee/exp/{years}") //pass years as a variable employee/exp/5 (? is not required)
//	public List<Employee> lookByExp(@RequestParam long years) {
	public List<Employee> lookByExp(@PathVariable("years") long years) {
		return employeeService.lookUpEmployeeByExp(years);
	}
	
	
	@RequestMapping(value = "/saveall", method = RequestMethod.POST)
	public List<Employee> saveAllEmployee(@RequestBody List<Employee> empList){
		List<Employee> list = (List<Employee>) employeeService.saveAllEmp(empList);
		return list;
	}
	
}
