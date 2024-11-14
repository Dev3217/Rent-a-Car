package com.project.dtos;
import lombok.Data;

import java.util.List;

@Data
public class CarDtoList {

    private List<CarDto> carDtoList;

	public List<CarDto> getCarDtoList() {
		return carDtoList;
	}

	public void setCarDtoList(List<CarDto> carDtoList) {
		this.carDtoList = carDtoList;
	}
    
    

}

