package com.EmployeeAdministration.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.EmployeeAdministration.Dto.EmployeeDTO;
import com.EmployeeAdministration.Repository.EmployeeRepository;
import com.EmployeeAdministration.Util.EmployeeEntityDtoUtil;

import com.EmployeeAdministration.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees
    public List<EmployeeDTO> getAll() {
        return employeeRepository.findAll().stream().map(EmployeeEntityDtoUtil::entityToDto).collect(Collectors.toList());
    }
    //View an employee
    public EmployeeDTO getById(Long id) {
        Optional<EmployeeDTO> optionalEmployee = Optional.ofNullable(employeeRepository.findById(id).map(EmployeeEntityDtoUtil::entityToDto).orElse(null));
        ;
        return optionalEmployee.orElseThrow(() ->
                new EmployeeException(+id+" Not Found in Directory"));
    }

    // Delete an Employee
    public void deleteById(Long id) {
        employeeRepository.findById(id).orElseThrow(
                () -> new EmployeeException("Employee Not Found. Check the input Enter correct Employee ID "+id+ " is Invalid"));
        employeeRepository.deleteById(id);
    }
    // To Create an Employee
    public EmployeeDTO save(EmployeeDTO e) {
        return EmployeeEntityDtoUtil.entityToDto(employeeRepository.save(EmployeeEntityDtoUtil.dtoToEntity(e)));
    }

    //To update an Employee
    public EmployeeDTO updateEmployee(EmployeeDTO newEmployee, Long id) {
        return employeeRepository.findById(id)
                .map(employees -> {
                    employees.setId(newEmployee.getId());
                    employees.setName(newEmployee.getName());
                    employees.setNumber(newEmployee.getNumber());
                    employees.setLocation(newEmployee.getLocation());
                    employees.setAddress(newEmployee.getAddress());
                    employees.setSalary(newEmployee.getSalary());
                    employees.setRole(newEmployee.getRole());
                    employees.setManager(newEmployee.getManager());
                    employees.setAddress(newEmployee.getMailid());
                    return employeeRepository.save(employees);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return employeeRepository.save(EmployeeEntityDtoUtil.dtoToEntity(newEmployee));
                });

    }
}
