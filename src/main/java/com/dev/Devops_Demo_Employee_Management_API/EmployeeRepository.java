package com.dev.Devops_Demo_Employee_Management_API;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	List<Employee> findByName(String name);

	
	
}
