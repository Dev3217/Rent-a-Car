package com.project.dtos;

import lombok.Data;

@Data
public class CarDealershipDto {
	
	private Long id;
    private String employee;
    private String dealership;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getDealership() {
		return dealership;
	}
	public void setDealership(String dealership) {
		this.dealership = dealership;
	}
    
    

}
