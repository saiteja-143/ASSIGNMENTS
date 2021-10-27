package com.EmployeeAdministration.Dto;

import javax.persistence.Column;

public class EmployeeDTO {
    private Long id;
    private String name;
    private String number;
    private String location;
    private String address;
    private Integer salary;
    private String role;
    private String manager;
    private String mailid;

//    public EmployeeDTO(Long id,String name, String number, String location) {
//        super();
//        this.id=id;
//        this.name = name;
//        this.number = number;
//        this.location = location;
//    }

    public EmployeeDTO() {

    }
    

    public EmployeeDTO(Long id, String name, String number, String location, String address, Integer salary, String role,
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

}
