package com.project.entities;

import jakarta.persistence.*;
import lombok.Data;
import com.project.dtos.CarTypeDto;
@Entity
@Data
@Table(name = "car_types")
public class CarType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Integer price;
    
    
    
    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getPrice() {
		return price;
	}



	public void setPrice(Integer price) {
		this.price = price;
	}



	public CarTypeDto getCarType() {
    	CarTypeDto carType = new CarTypeDto();
    	carType.setId(id);
    	carType.setDescription(description);
    	carType.setPrice(price);
        return carType;
    }

}
