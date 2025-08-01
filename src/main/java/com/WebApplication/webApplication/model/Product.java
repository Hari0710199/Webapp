package com.WebApplication.webApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Product")
public class Product {

	@Id
	private int id;
	private String name;
	private String emailId;
	private String date;

	public Product(int id, String name, String emailId, String date) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", emailId=" + emailId + ", date=" + date + "]";
	}

}
