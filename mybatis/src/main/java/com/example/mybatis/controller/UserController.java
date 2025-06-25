package com.example.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.mybatis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mybatis.entity.User;


@Controller
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String helloUser(Model model) {

    User user = userService.getUser("nakamura"); 
    model.addAttribute("user", user);

    return "hello-user";
  }
  
  
}
