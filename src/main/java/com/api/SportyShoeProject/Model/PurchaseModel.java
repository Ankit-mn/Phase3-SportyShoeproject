package com.api.SportyShoeProject.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name="Purchase")
@EnableTransactionManagement
public class PurchaseModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;

@Column(name="color")
private String color;

@Column (name="username")
private String username;

@Column(name="brand")
private String brand;

@Column(name="size")
private int  size;

@Column(name="price")
private int  price;

@Column(name="date_Ofpurchase")
private Date dateOfpurchase;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Date getDateOfpurchase() {
	return dateOfpurchase;
}

public void setDateOfpurchase(Date dateOfpurchase) {
	this.dateOfpurchase = dateOfpurchase;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}





}
