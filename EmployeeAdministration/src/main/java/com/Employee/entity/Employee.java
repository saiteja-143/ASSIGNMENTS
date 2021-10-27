package com.Employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Employee.DTO.EmployeeDTO;

@Entity
@Table(name="EmployeesTable")
public class Employee extends EmployeeDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Employee_id")
    private Long id;
    @Column(name="Employee_name")
    private String name;
    @Column(name="Employee_phoneNumber")
    private String number;
    @Column(name="Employee_location")
    private String location;
    @Column(name="Employee_Address")
    private String address;
    @Column(name="Employee_Salary")
    private Integer salary;
    @Column(name="Employee_Role")
    private String role;
    @Column(name="Reporting_Manager")
    private String manager;
    @Column(name="Employee_Mailid")
    private String mailid;

    public Employee() {
    }
    
    


public Employee(Long id, String name, String number, String location, String address, Integer salary, String role,
			String manager, String mailid) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.location = location;
		this.address = address;
		this.salary = salary;
		this.role = role;
		this.manager = manager;
		this.mailid = mailid;
	}





   


	

	
	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }











}
