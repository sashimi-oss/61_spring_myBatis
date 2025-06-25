package com.example.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.repository.UserRepository;
import com.example.mybatis.entity.User;

@Service
public class UserServiceImpl {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUser(String user_id) {
    return userRepository.getUser(user_id);
  }
  
}
