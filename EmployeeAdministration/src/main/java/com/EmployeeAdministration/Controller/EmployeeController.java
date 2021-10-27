package com.EmployeeAdministration.Controller;

import java.util.List;

import com.EmployeeAdministration.Dto.EmployeeDTO;
import com.EmployeeAdministration.Service.EmployeeServiceImpl;
import com.EmployeeAdministration.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    //To get all Employees
    @GetMapping("/all")
    public ResponseEntity<List<EmployeeDTO>> getAll() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    // To view an Employee
    
	@GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> findById(@PathVariable Long id) {
        try {
            return new ResponseEntity(this.employeeService.getById(id), HttpStatus.OK);
        } catch (EmployeeException exception ) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No one is Found with the specified Employee_Id in this Data base");

        }
    }
    //To create an Employee entity
    @PostMapping("/new")
    public ResponseEntity<EmployeeDTO> createNew(@RequestBody EmployeeDTO e) {
        this.employeeService.save(e);
       // return ResponseEntity(employeeService.save(e));
        return new ResponseEntity("Successfully created a Record", HttpStatus.OK);
    }

    // To update an Employee
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updatedEmployee(@PathVariable Long id,
                                                       @RequestBody EmployeeDTO employee){
        return new ResponseEntity<>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }

    // To delete an employee
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        this.employeeService.deleteById(id);
        return new ResponseEntity("Successfully deleted the Record", HttpStatus.OK);
    }


}




