package com.Employee.Util;

import com.Employee.DTO.EmployeeDTO;
import com.Employee.entity.Employee;

public class EmployeeEntityDtoUtil {

    public static EmployeeDTO entityToDto(Employee e) {
        return new EmployeeDTO(e.getId(),e.getName(),e.getNumber(),e.getLocation(), e.getAddress(), e.getSalary(), e.getRole(), e.getManager(), e.getMailid());
    }

    public static Employee dtoToEntity(EmployeeDTO e) {
        return new Employee(e.getId(),e.getName(),e.getNumber(),e.getLocation(), e.getAddress(), e.getSalary(), e.getRole(), e.getManager(), e.getMailid());
    }

}
