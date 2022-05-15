package io.swagger.service;

import java.util.List;

import io.swagger.model.User;

public interface UserService {
    public User addUser(User user);
    public User deleteUserById(long userId);
	public List<User> findAllUsers();
	public User updateUser(User user);
}
