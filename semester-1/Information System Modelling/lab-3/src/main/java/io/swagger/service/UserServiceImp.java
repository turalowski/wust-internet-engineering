package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}	

	@Override
	public User deleteUserById(Long id) {
		Optional<User> os = userRepository.findById(id);
		if(os.isPresent()) userRepository.deleteById(id);
		return os.get();
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(Long id, User user) {
		userRepository.updateUserById(user.getFullName(), user.getCompanyName(), user.getEmail(), id);
		return user;
	}
}
