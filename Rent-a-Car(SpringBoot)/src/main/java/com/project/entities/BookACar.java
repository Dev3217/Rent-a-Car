package com.project.entities;

import com.project.dtos.BookACarDto;
import com.project.enums.BookCarStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Data
public class BookACar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fromDate;

    private Date toDate;

    private Long days;

    private Long amount;
    
    private String employee;
    
    private String dealership;

    private BookCarStatus bookCarStatus;
    
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Long getDays() {
		return days;
	}

	public void setDays(Long days) {
		this.days = days;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
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

	public BookCarStatus getBookCarStatus() {
		return bookCarStatus;
	}

	public void setBookCarStatus(BookCarStatus bookCarStatus) {
		this.bookCarStatus = bookCarStatus;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "car_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Car car;

    public BookACarDto getBookACarDto() {
        BookACarDto bookACarDto = new BookACarDto();
        bookACarDto.setId(id);
        bookACarDto.setFromDate(fromDate);
        bookACarDto.setToDate(toDate);
        bookACarDto.setDays(days);
        bookACarDto.setAmount(amount);
        bookACarDto.setBookCarStatus(bookCarStatus);
        bookACarDto.setEmail(user.getEmail());
        bookACarDto.setUsername(user.getName());
        bookACarDto.setUserId(user.getId());
        bookACarDto.setEmployee(employee);
        bookACarDto.setDealership(dealership);
        
        return bookACarDto;
    }

}