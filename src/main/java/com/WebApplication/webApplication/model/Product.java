package com.WebApplication.webApplication.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

	private int id;
	private String name;
	private String emailId;
	private LocalDate date;

	public Product(int id, String name, String emailId, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.date = date;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", emailId=" + emailId + ", date=" + date + "]";
	}

}
