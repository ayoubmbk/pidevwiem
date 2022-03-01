package com.PiDev.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PiDev.Entities.Forum;
import com.PiDev.Entities.User;
import com.PiDev.Services.ForumServices;
import com.PiDev.Services.UserServices;
@RestController
@RequestMapping("/api3")
@CrossOrigin
public class UserRESTController {
	@Autowired
	UserServices userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllForums()
	{
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User createUser(@RequestBody User produit) {
			return userService.saveUser(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User updateUser(@RequestBody User produit) {
		return userService.updateUser(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id)
	{
			userService.deleteUserById(id);
	}

}
