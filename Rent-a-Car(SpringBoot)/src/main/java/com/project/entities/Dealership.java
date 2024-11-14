package com.project.entities;

import com.project.dtos.CarDealershipDto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dealerships")
public class Dealership {


	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


	public CarDealershipDto getCarDealership() {
    	CarDealershipDto carDealership = new CarDealershipDto();
    	carDealership.setId(id);
    	carDealership.setEmployee(employee);
    	carDealership.setDealership(dealership);
        return carDealership;
    }
}