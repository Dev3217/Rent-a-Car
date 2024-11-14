package com.project.dtos;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class CarImageDto {
	
	private Long id;

    private MultipartFile image;

    private byte[] returnedImage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public byte[] getReturnedImage() {
		return returnedImage;
	}

	public void setReturnedImage(byte[] returnedImage) {
		this.returnedImage = returnedImage;
	}
    
    

}