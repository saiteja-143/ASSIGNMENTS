package com.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
