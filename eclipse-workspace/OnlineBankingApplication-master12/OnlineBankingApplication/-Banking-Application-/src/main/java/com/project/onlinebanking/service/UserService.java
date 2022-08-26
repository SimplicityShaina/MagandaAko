package com.project.onlinebanking.service;

import com.project.onlinebanking.domain.User;

public interface UserService {
	public void save(User user);

	public User findByUsername(String username);
}
