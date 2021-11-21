/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.service;

import andile.employeemanagement.exception.UserNotFoundException;
import andile.employeemanagement.model.Employee;
import andile.employeemanagement.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andile
 */
@Service
public class EmployeeService {
   
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
     public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
      public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id" + id + "was not found"));
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    public void deleteEmployee(Long id){
           employeeRepository.deleteEmployeeById(id);
           }
}
