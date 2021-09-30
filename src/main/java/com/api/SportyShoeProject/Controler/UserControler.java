package com.api.SportyShoeProject.Controler;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.SportyShoeProject.Repo.UserRepo;
import com.api.SportyShoeProject.Model.*;


@RestController
@RequestMapping("User")
public class UserControler {
@Autowired
UserRepo userrepositry;

//retrieve all User from database
@GetMapping("all")
public List<UserModel>getAll()
{
	List<UserModel> User=(List<UserModel>)
			userrepositry.findAll();
	return User;	
}
//insert new user to database
@PostMapping("add")
public UserModel addUser(@RequestBody UserModel User)
{
	return userrepositry.save(User);
}

//get particular User by their id
@GetMapping("search/{id}")
public Optional<UserModel>getUserId(@PathVariable int id)
{
	return userrepositry.findById(id);
}

//update existing User
@PutMapping("update/{id}")
public UserModel updateUse(@RequestBody UserModel User)
{
	return userrepositry.save(User);
	
}

//delete particular Product from database
@DeleteMapping("delete/{id}")
public void deleteUser(@PathVariable int id)
{
	userrepositry.deleteById(id);
}


}