package com.greatlearning.ems.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmployeeService {
private EmployeeRepository employeeRepository;

public EmpServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository=employeeRepository;
	
}
	@Override
	public Employee insertEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee ee) {
		
		return employeeRepository.save(ee);
	}

}
