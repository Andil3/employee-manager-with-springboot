/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.repository;

import andile.employeemanagement.model.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Andile
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
