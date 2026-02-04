package com.example.employeecontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import java.util.*;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}
	@GetMapping
	public List<Employee> getemployees()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee GetEmployeeId(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return employeeService.saveEmployee(emp);
	}
	@PutMapping("/{id}")
	public Employee updateEMployee(@PathVariable int id,@RequestBody Employee updatedEmp)
	{
		return employeeService.updateEmployee(id, updatedEmp);
	}
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable int id)
    {
    	employeeService.deleteEmployee(id);
    	
    }
}