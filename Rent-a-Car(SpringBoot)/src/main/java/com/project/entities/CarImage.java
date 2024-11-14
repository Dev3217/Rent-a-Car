package com.project.entities;

import com.project.dtos.CarImageDto;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="cars_image")
public class CarImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Column(columnDefinition = "longblob")
    private byte[] image; 
    
    
    public CarImageDto getCarImage() {
    	CarImageDto carImage = new CarImageDto();
        carImage.setId(id);
        carImage.setReturnedImage(image);
        return carImage;
    }
}