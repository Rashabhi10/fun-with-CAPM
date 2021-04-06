package sst.rash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sst.rash.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByCompanyName(String companyName);
	
	@Query(nativeQuery = true, value = "SELECT * FROM public.employees WHERE years_in_exp = ?1 ")
	List<Employee> lookUpEmployeeByExp(long years);
}
