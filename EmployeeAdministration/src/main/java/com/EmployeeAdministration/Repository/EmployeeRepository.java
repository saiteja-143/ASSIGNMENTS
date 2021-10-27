package com.EmployeeAdministration.Repository;

import com.EmployeeAdministration.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
