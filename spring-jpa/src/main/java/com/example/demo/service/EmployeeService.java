package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
   private final com.example.demo.repo.EmployeeRepository repo;
   public EmployeeService(EmployeeRepository repo)
   {
	   this.repo = repo;
   }
   
   public Employee saveEmployee(Employee employee)
   {
	   System.out.println(employee.getId()+" -" + employee.getName()+"- "+employee.getSalary());
       return repo.save(employee);
   }
   public List<Employee> getAllEmployees()
   {
	   return repo.findAll();
   }
   public Employee getEmployeeById(int id)
   {
	   return repo.findById(id)
			   .orElseThrow();
   }
   public Employee updateEmployee(int id,com.example.demo.entity.Employee updatedEmployee)
   {
	   Employee existingEmployee = repo.findById(id)
			   .orElseThrow();
	    
	   existingEmployee.setName(updatedEmployee.getName());
	   existingEmployee.setSalary(updatedEmployee.getSalary());
	   return repo.save(existingEmployee);
   }
   public void deleteEmployee(int id)
   {
	   Employee existing = repo.findById(id)
			   .orElseThrow();
	     repo.delete(existing);
   }
}
