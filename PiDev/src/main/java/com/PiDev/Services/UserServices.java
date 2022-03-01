package com.PiDev.Services;

import java.util.List;

import com.PiDev.Entities.User;


public interface UserServices {
	
	User saveUser(User p);
	User updateUser(User p);
	void deleteUser(User p);
	void deleteUserById(Long id);
	User getUser(Long id);
	List<User> getAllUsers();

}
