package com.api.SportyShoeProject.Model;
import javax.persistence.*;

import org.springframework.transaction.annotation.EnableTransactionManagement;



@Entity
@Table(name="User")
@EnableTransactionManagement

public class UserModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="user_id")
private int user_id;

@Column (name="user_name")
private String user_name;

@Column(name = "password")
private String password;

@Column(name = "mobile_Number")
private int mobile_Number;

public int getUserid() {
	return user_id;
}

public void setUserid(int userid) {
	this.user_id = userid;
}

public String getUsername() {
	return user_name;
}

public void setUsername(String user_name) {
	this.user_name = user_name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getMobileNumber() {
	return mobile_Number;
}

public void setMobileNumber(int mobile_Number) {
	this.mobile_Number = mobile_Number;
}

}

