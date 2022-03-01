package com.PiDev.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PiDev.Entities.User;
import com.PiDev.Repos.UserRepository;

@Service
public class IUserServices implements UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User p) {
		return userRepository.save(p);
	}

	@Override
	public User updateUser(User p) {
		return userRepository.save(p);
	}

	@Override
	public void deleteUser(User p) {
		userRepository.delete(p);
		
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


}
