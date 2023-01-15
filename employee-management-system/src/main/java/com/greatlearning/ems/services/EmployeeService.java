package com.greatlearning.ems.services;

import java.util.List;

import com.greatlearning.ems.entity.Employee;



public interface EmployeeService {
Employee insertEmployee(Employee employee);
void deleteEmployeeById(int id);
List<Employee> getAllEmployees();
Employee getEmployeeById(int id);
Employee updateEmployee(Employee ee);

}
