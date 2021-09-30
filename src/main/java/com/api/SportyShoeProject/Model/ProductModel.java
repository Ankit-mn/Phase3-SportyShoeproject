package com.api.SportyShoeProject.Model;

import javax.persistence.*;

import org.springframework.transaction.annotation.EnableTransactionManagement;



@Entity
@Table(name="Product")
@EnableTransactionManagement
public class ProductModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="product_id")
private int productid;
@Column (name="product_name")
private String productname;

@Column(name = "season")
private String season;

@Column(name = "brand")
private String brand;

@Column(name = "category")
private String category;

@Column(name = "price")
private int price;

@Column(name = "color")
private String color;

@Column(name = "size")
private String size;

@Column(name = "created_date")
private String createddate;

@Column(name = "discount")
private int discount;

public int getProductid() {
	return productid;
}

public void setProductid(int productid) {
	this.productid = productid;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getCreateddate() {
	return createddate;
}

public void setCreateddate(String createddate) {
	this.createddate = createddate;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}
}
