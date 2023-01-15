package com.greatlearning.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;

@Component
public class MyAppRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee e1=new Employee();
		e1.setFirstName("Arun");
		e1.setLastName("Kumar");
		e1.setEmail("arunk01@gmail.com");
		
		Employee e2=new Employee();
		e2.setFirstName("Rahul");
		e2.setLastName("Raushan");
		e2.setEmail("rahulr01@gmail.com");
		employeeRepository.save(e1);
		employeeRepository.save(e2);
		}
		
	}
	


