package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
public UserRepo repo;
@Autowired
public MyService service;
@PostMapping("/user")
public User saveUser(@RequestBody User u)
{
	return this.repo.save(u);
}
@GetMapping("/user")
public List<User> showUser()
{
	return this.service.showData();
}
@GetMapping("/user/{uid}")
public User saveUser(@PathVariable("uid") int uid)
{
	return null;
}
}
