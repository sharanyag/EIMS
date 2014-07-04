package com.imac.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserManagerImpl implements UserManager {
	
	@Autowired
    private UserDAO userDAO;
	@Override
	@Transactional
	public void addUser(UserEntity user) {
		userDAO.addUser(user);
	}
	@Override
	@Transactional
	public List<UserEntity> getAllUsers() {
		return userDAO.getAllUsers();
	}
	@Override
	@Transactional
	public void deleteUser(Integer userId) {
		userDAO.deleteUser(userId);
	}

	public void setEmployeeDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
